package cl.lauragc.weatherinformation.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.lauragc.weatherinformation.interfaces.IWeatherBusiness;
import cl.lauragc.weatherinformation.viewmodels.WeatherRestResponse;

@RestController
public class WeatherController {
	
	@Autowired
	IWeatherBusiness weatherBusiness;
	
	@GetMapping("weathers/city")
	public ResponseEntity<WeatherRestResponse > getWeatherByCity(@RequestParam(value = "name", defaultValue = "") String city) {
		WeatherRestResponse response = weatherBusiness.getWeatherByCity(city);
		if(response.getErrors()!=null){
			return new ResponseEntity<WeatherRestResponse >(response, HttpStatus.BAD_REQUEST);
		} else
		{
			return new ResponseEntity<WeatherRestResponse >(response, HttpStatus.OK);
		}
	}
}