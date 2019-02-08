package com.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.weatherapp.service.WeatherAppServiceImpl;

@Controller
public class WeatherAppController {
	@Autowired
	public WeatherAppServiceImpl weatherAppServiceImpl;
	
	
	@GetMapping(value="/weatherReport")
	public String weatherReport(ModelMap model) {
		return "weatherInfo";
	}
}
