package com.vyshu.weatherdetails.model;

public final class contant_author {
	
	private String email;
	private String auth_note;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuth_note() {
		return auth_note;
	}
	public void setAuth_note(String auth_note) {
		this.auth_note = auth_note;
	}
	@Override
	public String toString() {
		return "contant_author [email=" + email + ", auth_note=" + auth_note + "]";
	}
	

}
