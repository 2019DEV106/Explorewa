package com.weatherapp.service;

import com.weatherapp.customexception.WeatherException;
import com.weatherapp.model.WeatherData;

public interface WeatherAppService {
	public  WeatherData fetchweatherInfo() throws WeatherException ;
	
}

