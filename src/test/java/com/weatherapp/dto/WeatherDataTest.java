package com.weatherapp.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.sun.tools.javac.util.List;

public class WeatherDataTest {

	@InjectMocks
	private WeatherData weatherData;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSetDt() {
		weatherData.setDt("1549806120");
		assertEquals(weatherData.getDt(), "1549806120");
	}

	@Test
	public void testSetDtIsNull() {
		weatherData.setDt(null);
		assertNull(weatherData.getDt());
	}

	@Test
	public void testSetVisibility() {
		weatherData.setVisibility("6000");
		assertEquals(weatherData.getVisibility(), "6000");
	}

	@Test
	public void testSetVisibilityIsNull() {
		weatherData.setVisibility(null);
		assertNull(weatherData.getVisibility());
	}

	@Test
	public void testSetName() {
		weatherData.setName("brussels");
		assertEquals(weatherData.getName(), "brussels");
	}

	@Test
	public void testSetNameIsNull() {
		weatherData.setName(null);
		assertNull(weatherData.getName());
	}

	@Test
	public void testSetCod() {
		weatherData.setCod("200");
		assertEquals(weatherData.getCod(), "200");
	}

	@Test
	public void testSetCodIsNull() {
		weatherData.setCod(null);
		assertNull(weatherData.getCod(), null);
	}

	@Test
	public void testSetId() {
		weatherData.setId("2800865");
		assertEquals(weatherData.getId(), "2800865");
	}

	@Test
	public void testSetIdIsNull() {
		weatherData.setId(null);
		assertNull(weatherData.getId());
	}

	@Test
	public void testSetBase() {
		weatherData.setBase("stations");
		assertEquals(weatherData.getBase(), "stations");

	}

	@Test
	public void testSetBaseIsNull() {
		weatherData.setBase(null);
		assertNull(weatherData.getBase());
	}

	@Test
	public void testSetCoordinatesDetails() {
		CoordinatesDetails coordinatesDetails = new CoordinatesDetails();
		coordinatesDetails.setLatitude("0.242");
		weatherData.setCoordinatesDetails(coordinatesDetails);
		assertEquals(weatherData.getCoordinatesDetails().getLatitude(), "0.242");
	}

	@Test
	public void testSetWeatherDetails() {
		WeatherDetails weatherDetails = new WeatherDetails();
		weatherDetails.setTemp("8");
		assertEquals(weatherDetails.getTemp(), "8");
	}

	@Test
	public void testSetCloudType() {
		CloudDetails cloudDetails = new CloudDetails();
		cloudDetails.setAll("92");
		assertEquals(cloudDetails.getAll(), "92");
	}

	@Test
	public void testWeatherType() {
		WeatherType weatherType = new WeatherType();
		weatherType.setCountry("Belgium");
		assertEquals(weatherType.getCountry(), "Belgium");
	}

	@Test
	public void testSetWindDetails() {
		WindDetails windDetails = new WindDetails();
		windDetails.setSpeed("34");
		assertEquals(windDetails.getSpeed(), "34");
	}
	
	@Test
	public void testSetWindDetailsIsNotNull() {
		weatherData.setWindDetails(new WindDetails());
		assertNotNull(weatherData.getWindDetails());
	}
	@Test
	public void testSetCloudTypeIsNotNull() {
		weatherData.setCloudType(new CloudDetails());
		assertNotNull(weatherData.getCloudType());
	}
	@Test
	public void testSetWeatherTypeIsNotNull() {
		weatherData.setWeatherType(new WeatherType());
		assertNotNull(weatherData.getWeatherType());
	}
	@Test
	public void testSetWeatherDetailsIsNotNull() {
		weatherData.setWeatherDetails(new WeatherDetails());
		assertNotNull(weatherData.getWeatherDetails());
	}
	
	@Test
	public void testSetWeatherIsNotNull() {
		weatherData.setWeather(new Weather[5]);
		assertNotNull(weatherData.getWeather());
	}
	
	 
}
