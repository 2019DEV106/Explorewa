package com.weatherapp.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class WeatherDetailsTest {
	
	@InjectMocks
	WeatherDetails weatherDetails;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSetTemp() {
		weatherDetails.setTemp("8");
		assertEquals(weatherDetails.getTemp(),"8");
	}

	@Test
	public void testSetTempMin() {
		weatherDetails.setTempMin("2");
		assertEquals(weatherDetails.getTempMin(),"2");
	}

	@Test
	public void testSetHumidity() {
		weatherDetails.setHumidity("low");
		assertEquals(weatherDetails.getHumidity(),"low");
	}

	@Test
	public void testSetPressure() {
		weatherDetails.setPressure("33");
		assertEquals(weatherDetails.getPressure(),"33");
	}

	@Test
	public void testSetTempMax() {
		weatherDetails.setTempMax("8");
		assertEquals(weatherDetails.getTempMax(),"8");
	}

}
