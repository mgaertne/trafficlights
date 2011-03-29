package org.trafficlights.test.acceptance;

import org.trafficlights.domain.LightState;

public class FirstLightSwitchingCrossingController {

	private LightState firstState;
	
	private LightState secondState;
	
	public void setFirstLight(LightState state) {
		firstState = state;
	}

	public void setSecondLight(LightState state) {
		secondState = state;
	}
	
	public void execute() {
		if (!LightState.RED.equals(secondState)) {
			firstState = LightState.UNKNOWN;
			secondState = LightState.UNKNOWN;
			return;
		}
		firstState = firstState.next();
	}
	
	public LightState firstLight() {
		return firstState;
	}
	
	public LightState secondLight() {
		return secondState;
	}
}
