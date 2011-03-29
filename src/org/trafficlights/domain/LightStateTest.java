package org.trafficlights.domain;

import static org.junit.Assert.*;

import org.junit.Test;


public class LightStateTest {

	@Test
	public void testStateChange() {
		assertEquals(LightState.RED_YELLOW, LightState.RED.next());
	}
}
