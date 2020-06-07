package cl.lauragc.weatherinformation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WeatherBusiness implements IWeatherBusiness{
	public WeatherRestResponse getWeatherByCity(String cityName) {
		// TODO: obtain woeid
		// obtain temperatures
		// Transform from celsius to farenheit (put in a helper, maybe?)
		// return the object
		WeatherRestResponse response = new WeatherRestResponse();
		List<CityWeather> days = new ArrayList<CityWeather>();
		response.setData(days);
		return response;
	}
}
