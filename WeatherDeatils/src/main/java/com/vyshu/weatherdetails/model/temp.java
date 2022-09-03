package com.vyshu.weatherdetails.model;

public class temp {
	private String c;
	private String f;
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "temp [c=" + c + ", f=" + f + "]";
	}
	

}
