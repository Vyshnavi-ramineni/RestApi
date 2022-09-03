package com.vyshu.weatherdetails.model;

public class currentConditions {
private String dayhours;
private temp temp;
private String precip;
private String humidity;
private wind wind;
private String iconURl;
private String comment;
public String getDayhours() {
	return dayhours;
}
public void setDayhours(String dayhours) {
	this.dayhours = dayhours;
}
public temp getTemp() {
	return temp;
}
public void setTemp(temp temp) {
	this.temp = temp;
}
public String getPrecip() {
	return precip;
}
public void setPrecip(String precip) {
	this.precip = precip;
}
public String getHumidity() {
	return humidity;
}
public void setHumidity(String humidity) {
	this.humidity = humidity;
}
public wind getWind() {
	return wind;
}
public void setWind(wind wind) {
	this.wind = wind;
}
public String getIconURl() {
	return iconURl;
}
public void setIconURl(String iconURl) {
	this.iconURl = iconURl;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
@Override
public String toString() {
	return "currentConditions [dayhours=" + dayhours + ", temp=" + temp + ", precip=" + precip + ", humidity="
			+ humidity + ", wind=" + wind + ", iconURl=" + iconURl + ", comment=" + comment + "]";
}



}
