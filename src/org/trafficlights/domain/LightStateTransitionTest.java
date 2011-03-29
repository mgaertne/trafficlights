package org.trafficlights.domain;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

import java.util.List;

import static org.trafficlights.domain.LightState.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LightStateTransitionTest {
	
	@Parameters
	public static List<Object[]> data() {
		return asList(new Object[][] {
				{ RED, RED_YELLOW },
				{ RED_YELLOW, GREEN },
				{ GREEN, YELLOW },
				{ YELLOW, RED },
				{ UNKNOWN, UNKNOWN }
		});
	}

	private LightState previousState;
	private LightState nextState;
	
	public LightStateTransitionTest(LightState previousState, LightState nextState) {
		this.previousState = previousState;
		this.nextState = nextState;
	}
	
	@Test
	public void testStateChange() {
		assertEquals(nextState, previousState.next());
	}
}
