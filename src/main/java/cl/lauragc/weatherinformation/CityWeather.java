package cl.lauragc.weatherinformation;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityWeather {
	private String cityName;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Date date;
	private Float celsiusMin;
	private Float celsiusMax;
	private Float farenheitMin;
	private Float farenheitMax;
	
	public CityWeather() {
	}

	public CityWeather(String cityName, Float celsiusMin, Float celsiusMax, Float farenheitMin, Float farenheitMax) {
		this.cityName = cityName;
		this.celsiusMin = celsiusMin;
		this.celsiusMax = celsiusMax;
		this.farenheitMin = farenheitMin;
		this.farenheitMax = farenheitMax;
	}

	public String getCityName() {
		return cityName;
	}
	@JsonProperty("celsiusMin")
	public Float getCelsiusMin() {
		return celsiusMin;
	}
	@JsonProperty("celsiusMax")
	public Float getCelsiusMax() {
		return celsiusMax;
	}

	public Float getFarenheitMin() {
		return farenheitMin;
	}

	public Float getFarenheitMax() {
		return farenheitMax;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@JsonProperty("min_temp")
	public void setCelsiusMin(Float celsiusMin) {
		this.celsiusMin = celsiusMin;
	}
	
	public void setCelsiusMax(Float celsiusMax) {
		this.celsiusMax = celsiusMax;
	}

	public void setFarenheitMin(Float farenheitMin) {
		this.farenheitMin = farenheitMin;
	}

	public void setFarenheitMax(Float farenheitMax) {
		this.farenheitMax = farenheitMax;
	}
	public Date getDate() {
		return date;
	}
	@JsonProperty("applicable_date")
	public void setDate(Date date) {
		this.date = date;
	}
	

}
