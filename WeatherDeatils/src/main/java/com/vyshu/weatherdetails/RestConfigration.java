package com.vyshu.weatherdetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfigration {	
		@Value("${weatherURL}")
		private String weatherURL;
		
		public String getWeatherURL() {
			return weatherURL;
		}

		public void setWeatherURL(String weatherURL) {
			this.weatherURL = weatherURL;
		}

		@Bean
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}
}


