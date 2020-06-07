package cl.lauragc.WeatherInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	@GetMapping("/getWeatherbyCity")
	public Weather getWeatherByCity(@RequestParam(value = "city", defaultValue = "") String city) {
		//TODO implements interface to call the method inside the business
		return new Weather("",1,1,1,1);
	}
}