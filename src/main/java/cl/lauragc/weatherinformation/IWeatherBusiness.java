package cl.lauragc.weatherinformation;

public interface IWeatherBusiness {
	public DayWeatherRest getWeatherByCity(String cityName);
}
