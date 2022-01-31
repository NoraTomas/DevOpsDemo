package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	/*
		In a real world scenario, we would not hard-code this -15 degrees data. Instead we would get real data
		from sensors and etc. Just like OpenWeather API: https://openweathermap.org/api
	 */
	@GetMapping("/")
	public String greeting() {
		return ("The temperature in Oslo is 4 degrees");
	}
}
