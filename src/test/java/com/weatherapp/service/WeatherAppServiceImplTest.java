package com.weatherapp.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.weatherapp.constants.WeatherAppConstants;
import com.weatherapp.customexception.WeatherException;
import com.weatherapp.dto.WeatherData;

public class WeatherAppServiceImplTest {


	@Mock
	private RestTemplate restTemplate;
	
	@InjectMocks
	private WeatherAppServiceImpl weatherAppService;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	 
	@Test
	public void testFetchweatherInfoReturnValidResponseForValidURL() {
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		ResponseEntity<String> response = testRestTemplate.getForEntity(WeatherAppConstants.WHEATHER_API_URI, String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
	}
	
	
	@Test
	public void testfetchweatherInfo() throws Exception {
		ResponseEntity<String> response = new ResponseEntity<String>("{\"name\":\"Brussels\"}", HttpStatus.OK);
		when(restTemplate.getForEntity(WeatherAppConstants.WHEATHER_API_URI, String.class))
		.thenReturn(response);
		WeatherData weatherData = weatherAppService.fetchweatherInfo();
		assertNotNull(weatherData);
		assertEquals("Brussels", weatherData.getName());
		 
	}

	
	@Test(expected=WeatherException.class)
	public void testIncorrectJsonResponse() throws Exception {
		ResponseEntity<String> response = new ResponseEntity<String>("not a json", HttpStatus.OK);
		when(restTemplate.getForEntity(WeatherAppConstants.WHEATHER_API_URI, String.class))
		.thenReturn(response);
		weatherAppService.fetchweatherInfo();
		
	}
	
}
