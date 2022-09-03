package com.vyshu.weatherdetails.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Weather {
	
	private String region;
	private currentConditions currentCondition;
	private List<next_days> next_days;
	private contant_author contant_author;
	private String data_source;
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public currentConditions getCurrentCondition() {
		return currentCondition;
	}
	public void setCurrentCondition(currentConditions currentCondition) {
		this.currentCondition = currentCondition;
	}
	public List<next_days> getNext_days() {
		return next_days;
	}
	public void setNext_days(List<next_days> next_days) {
		this.next_days = next_days;
	}
	public contant_author getContant_author() {
		return contant_author;
	}
	public void setContant_author(contant_author contant_author) {
		this.contant_author = contant_author;
	}
	public String getData_source() {
		return data_source;
	}
	public void setData_source(String data_source) {
		this.data_source = data_source;
	}
	@Override
	public String toString() {
		return "Weather [region=" + region + ", currentCondition=" + currentCondition + ", next_days=" + next_days
				+ ", contant_author=" + contant_author + ", data_source=" + data_source + "]";
	}
	
	
	

}
