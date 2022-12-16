package com.resourceRequirement.resourceRequirement.dtos;

public class CityResponse {
	
	private long cityId;
	private String cityName;
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public CityResponse(long cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}
	public CityResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
