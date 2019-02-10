package com.weatherapp.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class WindDetailsTest {


	@InjectMocks
	private WindDetails wind;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSetDeg() {
		wind.setDeg("260");
		assertEquals(wind.getDeg(), "260");
	}

	@Test
	public void testSetSpeed() {
		wind.setSpeed("260");
		assertEquals(wind.getSpeed(), "260");
	}
	
	@Test
	public void testSetGust() {
		wind.setGust("18.05");
		assertEquals(wind.getGust(), "18.05");
	}

}
