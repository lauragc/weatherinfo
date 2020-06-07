package cl.lauragc.weatherinformation.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.lauragc.weatherinformation.DayWeatherRest;
import cl.lauragc.weatherinformation.IWeatherBusiness;

@RestController
public class WeatherController {
	
	@Autowired
	IWeatherBusiness weatherBusiness;
	
	@GetMapping("weathers/city")
	public ResponseEntity<DayWeatherRest> getWeatherByCity(@RequestParam(value = "name", defaultValue = "") String city) {
		DayWeatherRest response = weatherBusiness.getWeatherByCity(city);
		return new ResponseEntity<DayWeatherRest>(response, HttpStatus.OK);
	}
}