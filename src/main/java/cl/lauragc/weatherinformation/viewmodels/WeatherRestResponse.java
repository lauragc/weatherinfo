package cl.lauragc.weatherinformation.viewmodels;

import java.util.List;

import cl.lauragc.weatherinformation.restconsumer.RestError;

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
