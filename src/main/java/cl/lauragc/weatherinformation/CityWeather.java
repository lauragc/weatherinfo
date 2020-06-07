package cl.lauragc.weatherinformation;

public class CityWeather {

	private final String cityName;
	private final int celsiusMin;
	private final int celsiusMax;
	private final int farenheitMin;
	private final int farenheitMax;
	
	public CityWeather(String cityName, int celsiusMin, int celsiusMax, int farenheitMin, int farenheitMax) {
		this.cityName = cityName;
		this.celsiusMin = celsiusMin;
		this.celsiusMax = celsiusMax;
		this.farenheitMin = farenheitMin;
		this.farenheitMax = farenheitMax;
	}

	public String getCityName() {
		return cityName;
	}

	public int getCelsiusMin() {
		return celsiusMin;
	}

	public int getCelsiusMax() {
		return celsiusMax;
	}

	public int getFarenheitMin() {
		return farenheitMin;
	}

	public int getFarenheitMax() {
		return farenheitMax;
	}

}
