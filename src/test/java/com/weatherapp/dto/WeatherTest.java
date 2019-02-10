package com.weatherapp.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class WeatherTest {

	@InjectMocks
	Weather weather;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSetIcon() {
		weather.setIcon("09d");
		assertEquals(weather.getIcon(), "09d");
	}

	@Test
	public void testSetDescription() {
		weather.setDescription("shower rain");
		assertEquals(weather.getDescription(), "shower rain");
	}

	@Test
	public void testSetMain() {
		weather.setMain("weather details");
		assertEquals(weather.getMain(), "weather details");
	}

	@Test
	public void testSetId() {
		weather.setId("023");
		assertEquals(weather.getId(), "023");
	}

}
