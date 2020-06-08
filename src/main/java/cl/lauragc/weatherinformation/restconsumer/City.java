package cl.lauragc.weatherinformation.restconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	@JsonProperty("title")
	private String name;
	@JsonProperty("latt_long")
	private String lattAndLong;
	private int woeid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLattAndLong() {
		return lattAndLong;
	}
	public void setLattAndLong(String lattAndLong) {
		this.lattAndLong = lattAndLong;
	}
	public int getWoeid() {
		return woeid;
	}
	public void setWoeid(int woeid) {
		this.woeid = woeid;
	}
	
}
