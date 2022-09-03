package com.vyshu.weatherdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.vyshu.weatherdetails.service.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	@GetMapping(path="/weather/{city}",produces = "application/json")
	public ResponseEntity<String> fetchWeatherByCity(@PathVariable String city) {
		String fetchByCity =  weatherService.weatherDetails(city);
		return new ResponseEntity<String>(fetchByCity.toString(), HttpStatus.OK);
	}
	
	@PostMapping(path="/weather/newWeather",consumes = "application/json",produces = "application/json")
	public ResponseEntity<String> addNewFeatures (@RequestBody String payload){
		JsonObject requestJsonObject = new Gson().fromJson(payload, JsonObject.class);
		JsonObject weather_Condition = null;
		try {
			weather_Condition = weatherService.weather(requestJsonObject);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return  new ResponseEntity<String>(weather_Condition.toString(), HttpStatus.OK) ;
		
	}
}
