package cl.lauragc.weatherinformation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedWeatherResponse {
	@JsonProperty("consolidated_weather")
	private List<CityWeather> consolidatedWeather;

	public List<CityWeather> getConsolidatedWeather() {
		return consolidatedWeather;
	}
	
}
