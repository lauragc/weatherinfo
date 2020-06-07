package cl.lauragc.weatherinformation.restconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	private String type;
	private String value;
	@JsonProperty("latt_long")
	private float lattAndLong;
	private int woeid;
	private int distance;
	
	
}
