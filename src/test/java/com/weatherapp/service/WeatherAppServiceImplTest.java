package com.weatherapp.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.weatherapp.customexception.WeatherException;

public class WeatherAppServiceImplTest {


	@InjectMocks
	private WeatherAppServiceImpl weatherAppService;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFetchweatherInfo() throws WeatherException {
		assertNull(weatherAppService.fetchweatherInfo());
	}

}
