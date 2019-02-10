package com.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.weatherapp.customexception.WeatherException;
import com.weatherapp.service.WeatherAppServiceImpl;

@Controller
public class WeatherAppController {
	@Autowired
	public WeatherAppServiceImpl weatherAppServiceImpl;
	
	
	@GetMapping(value="/weatherReport")
	public String weatherReport(ModelMap model) throws WeatherException {
		model.put("weatherData",weatherAppServiceImpl.fetchweatherInfo());
		return "weatherInfo";
	} 
	/*
	 * consumed service in controller and updated the unit test case of controller test. 
	 */
}
