package cl.lauragc.weatherinformation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import cl.lauragc.weatherinformation.restconsumer.City;

import org.springframework.web.client.ResourceAccessException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherBusiness implements IWeatherBusiness{

	public WeatherRestResponse getWeatherByCity(String cityName) {
		WeatherRestResponse response = new WeatherRestResponse();
		List<RestError> errors = new ArrayList<RestError>();
		if(cityName.isEmpty()){
			RestError error = new RestError(418,"City name is mandatory");
			errors.add(error);
		}
		else {
			List<City> cities = this.getCitiesByName(cityName);
			List<CityWeather> weathers = new ArrayList<CityWeather>();
			for(City city : cities){
				CityWeather weather = getWeatherByWoeid(String.valueOf(city.getWoeid()));
				if(weather!=null) {
					weather.setCityName(city.getName());
					weather.setFarenheitMin(this.celsiusToFarenheit(weather.getCelsiusMin()));
					weather.setFarenheitMax(this.celsiusToFarenheit(weather.getCelsiusMax()));
					weathers.add(weather);
				} else {
					RestError error = new RestError(500,"We couldnt get the weather of " + city.getName());
					errors.add(error);
				}
			}
			response.setData(weathers);
		}
		response.setErrors(errors);
		return response;
	}
	/**
	 * Obtains a List of cities from a name, with their respective woeid            
	 * <p>
	 * @param  cityName the name of the city     
	 * @return List of cities 
	 */
	private List<City> getCitiesByName(String cityName) throws ResourceAccessException
	{
		//TODO: put the url string in some config 
		ObjectMapper mapper = new ObjectMapper(); 
		List<City> cities = new ArrayList<City>();
		RestResponseErrorHandler responseHandler = new RestResponseErrorHandler();
		try {
			String jsonResponse = new RestConsumer<String, String>().execute(new RequestDetails("https://www.metaweather.com/api/location/search/?query=" + cityName, HttpMethod.GET), "", responseHandler, String.class);
			if(jsonResponse!=null) {
				cities = mapper.readValue(jsonResponse, new TypeReference<List<City>>(){});
			}
		} catch (ResourceAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return cities;
	}
	/**
	 * Obtains the most recent weather forecast for a city location by its woeid         
	 * <p>
	 * @param  cityName the name of the city     
	 * @return List of cities 
	 */
	private CityWeather getWeatherByWoeid(String woeid){
		ObjectMapper mapper = new ObjectMapper(); 		
		CityWeather weatherByCity = new CityWeather();
		RestResponseErrorHandler responseHandler = new RestResponseErrorHandler();
		try {
			String jsonResponse = new RestConsumer<String, String>().execute(new RequestDetails("https://www.metaweather.com/api/location/" + woeid, HttpMethod.GET), "", responseHandler, String.class);
			if(jsonResponse!=null) {
				ConsolidatedWeatherResponse weathersByCity = mapper.readValue(jsonResponse,ConsolidatedWeatherResponse.class);
				weatherByCity = weathersByCity.getConsolidatedWeather().stream().max(Comparator.comparing(CityWeather::getDate)).get();
			}
		} catch (ResourceAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return weatherByCity;
	}
	/**
	 * Transform from celsius to farenheit        
	 * <p>
	 * @param  celsius 
	 * @return value in farenheits
	 */
	private Float celsiusToFarenheit(Float celsius)
	{
		if(celsius!=null)
			return (celsius * 9/5) + 32;
		else {
			return celsius;
		}
	}
}
