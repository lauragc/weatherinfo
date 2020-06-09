package cl.lauragc.weatherinformation.interfaces;

import cl.lauragc.weatherinformation.viewmodels.WeatherRestResponse;

public interface IWeatherBusiness {
	/**
	 * Obtains the weather with a name of a city in English                       
	 * <p>
	 * When the city name exists, it will respond with the city's weather.
	 * If there is more than one city with that name, a list of cities and theirs weathers will appear
	 * It will return a functional error if there is no city name or the city name does not exist.
	 *
	 * @param  cityName the name of the city     
	 * @return The rest data object
	 */
	public WeatherRestResponse getWeatherByCity(String cityName);
}
