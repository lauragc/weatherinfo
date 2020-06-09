package cl.lauragc.weatherinformation.viewmodels;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityWeather {
	private String cityName;
	private Date date;
	private Float celsiusMin;
	private Float celsiusMax;
	private Float farenheitMin;
	private Float farenheitMax;
	
	public CityWeather() {
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
	@JsonProperty("max_temp")
	public void setCelsiusMax(Float celsiusMax) {
		this.celsiusMax = celsiusMax;
	}

	public void setFarenheitMin(Float farenheitMin) {
		this.farenheitMin = farenheitMin;
	}

	public void setFarenheitMax(Float farenheitMax) {
		this.farenheitMax = farenheitMax;
	}
	@JsonProperty("date")
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getDate() {
		return date;
	}
	@JsonProperty("applicable_date")
	public void setDate(Date date) {
		this.date = date;
	}
	

}
