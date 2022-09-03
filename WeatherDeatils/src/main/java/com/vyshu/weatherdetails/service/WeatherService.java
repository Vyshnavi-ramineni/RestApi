package com.vyshu.weatherdetails.service;

import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vyshu.weatherdetails.RestConfigration;
import com.vyshu.weatherdetails.exception.GenericException;

@Service
public class WeatherService {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	RestConfigration restConfiguration;
	org.slf4j.Logger logger = LoggerFactory.getLogger(WeatherService.class);
	
	public  String weatherDetails(String city)  {
		String response = null;
		try {
		response =  restTemplate.getForObject(restConfiguration.getWeatherURL()+"/"+city,String.class);
		 logger.info(response);
		 JsonObject responseObject = new Gson().fromJson(response, JsonObject.class);
		  String s = responseObject.get("region").getAsString();
		  logger.info(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response ;
	}
	
	 public JsonObject weather(JsonObject payload)  {
		 JsonObject Response = null;
		 try {
		 Response = payload.get("currentConditions").getAsJsonObject();
		 }catch(Exception e) {
			 e.printStackTrace();
			 logger.error(e.getMessage());
				throw new GenericException();
		 }
		return Response;
		
	}
	
	}
