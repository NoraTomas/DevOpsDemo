package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	@GetMapping("/")
	public String greeting() {
		return ("The temperature in Oslo is -10 degrees");
	}
}
