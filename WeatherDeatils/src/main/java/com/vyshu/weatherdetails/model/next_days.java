package com.vyshu.weatherdetails.model;

public class next_days {
	private String day;
	private String comment;
	private max_tmp max_tmp;
	private min_temp min_temp;
	private String iconURL;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public max_tmp getMax_tmp() {
		return max_tmp;
	}
	public void setMax_tmp(max_tmp max_tmp) {
		this.max_tmp = max_tmp;
	}
	public min_temp getMin_temp() {
		return min_temp;
	}
	public void setMin_temp(min_temp min_temp) {
		this.min_temp = min_temp;
	}
	public String getIconURL() {
		return iconURL;
	}
	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}
	@Override
	public String toString() {
		return "next_days [day=" + day + ", comment=" + comment + ", max_tmp=" + max_tmp + ", min_temp=" + min_temp
				+ ", iconURL=" + iconURL + "]";
	}
	

}
