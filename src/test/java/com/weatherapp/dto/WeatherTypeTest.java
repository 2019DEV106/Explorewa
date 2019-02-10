package com.weatherapp.dto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class WeatherTypeTest {
 
	@InjectMocks
	private WeatherType weatherType;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSetCountry() {
		weatherType.setCountry("Brussels");
		assertEquals(weatherType.getCountry(), "Brussels");
	}

	@Test
	public void testSetSunrise() {
		weatherType.setSunrise("1549782221");
		assertEquals(weatherType.getSunrise(), "1549782221");
	}

	@Test
	public void testSetSunset() {
		weatherType.setSunset("15497823423");
		assertEquals(weatherType.getSunset(), "15497823423");
	}

	@Test
	public void testSetId() {
		weatherType.setId("234");
		assertEquals(weatherType.getId(), "234");
	}

	@Test
	public void testSetType() {
		weatherType.setType("cloudy");
		assertEquals(weatherType.getType(), "cloudy");
	}

	@Test
	public void testSetMessage() {
		weatherType.setMessage("Sunny");
		assertEquals(weatherType.getMessage(), "Sunny");
	}

}
