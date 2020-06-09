package cl.lauragc.weatherinformation.restconsumer;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="endpoint")
public class MetaWeatherRest {
	private String urlweather;
	
	
	public MetaWeatherRest() {
	}

	public String getUrlweather() {
		return urlweather;
	}

	public void setUrlweather(String urlweather) {
		this.urlweather = urlweather;
	}
}
