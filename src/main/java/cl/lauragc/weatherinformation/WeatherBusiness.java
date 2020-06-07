package cl.lauragc.weatherinformation;

import org.springframework.stereotype.Service;

@Service
public class WeatherBusiness implements IWeatherBusiness{
	public DayWeatherRest getWeatherByCity(String cityName) {
		return new DayWeatherRest("",1,1,1,1);
	}
}
