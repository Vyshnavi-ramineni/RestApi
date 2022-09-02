package com.vyshu.weatherdetails.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;

@Service
public class WeatherService {
	
	public  String weatherDetails(String city) {
		String response = null;
		try {
	RestTemplate rt = new RestTemplate();
	
	String url =  "https://weatherdbi.herokuapp.com/data/weather";
     response =  rt.getForObject(url+"/"+city,String.class);
     System.out.print(response);
	
	}catch(Exception e) {
		e.printStackTrace();
	}
		return response ;
	} 
	
	}
