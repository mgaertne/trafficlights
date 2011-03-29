package org.trafficlights.domain;

import static java.util.Arrays.*;
import static org.junit.Assert.*;
import static org.trafficlights.domain.LightState.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CrossingValidatorTest {

	@Parameters
	public static List<Object[]> values() {
		return asList(new Object[][] {
				{RED, RED, true},
				{GREEN, RED, true},
				{YELLOW, RED, true},
				{RED_YELLOW, RED, true},
				{UNKNOWN, RED, false},
				{GREEN, GREEN, false},
				{YELLOW, GREEN, false},
				{RED_YELLOW, GREEN, false},
				{RED, GREEN, true},
		});
	}
	
	private LightState firstState;
	private LightState secondState;
	private boolean valid;
	
	public CrossingValidatorTest(LightState firstState, LightState secondState,
			boolean valid) {
		this.firstState = firstState;
		this.secondState = secondState;
		this.valid = valid;
	}

	@Test
	public void isValidConfiguration() {
		assertEquals(valid, new CrossingValidator().isValidConfiguration(firstState, secondState));
	}
}
