package com.weatherapp.customexception;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeatherExceptionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWeatherExceptionString() {
		WeatherException weatherException = new WeatherException("test");
		assertEquals(weatherException.getMessage(), "test");
	}

	@Test
	public void testWeatherExceptionStringException() {
		WeatherException weatherException = new WeatherException("test", new Exception());
		assertEquals(weatherException.getMessage(), "test");
	}

}
