package com.vyshu.weatherdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.vyshu.weatherdetails.service.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	@GetMapping(path="/weather/{city}",produces = "application/json")
	public ResponseEntity<String> fetchEstimateById(@PathVariable String city) {
		String estimateById =  weatherService.weatherDetails(city);
		return new ResponseEntity<String>(estimateById.toString(), HttpStatus.OK);
	}
	
	
	

}
