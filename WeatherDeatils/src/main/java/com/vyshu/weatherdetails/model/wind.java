package com.vyshu.weatherdetails.model;

public class wind {
	
	private String km;
	private String mile;
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getMile() {
		return mile;
	}
	public void setMile(String mile) {
		this.mile = mile;
	}
	@Override
	public String toString() {
		return "wind [km=" + km + ", mile=" + mile + "]";
	}
	

}
