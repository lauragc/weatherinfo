package cl.lauragc.weatherinformation;

import java.util.List;

public class WeatherRestResponse {
	private List<CityWeather> data;
	private List<RestError> errors;
	public List<CityWeather> getData() {
		return data;
	}
	public void setData(List<CityWeather> data) {
		this.data = data;
	}
	public List<RestError> getErrors() {
		return errors;
	}
	public void setErrors(List<RestError> errors) {
		this.errors = errors;
	}
	
}
