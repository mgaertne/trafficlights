package org.trafficlights.test.acceptance;

import org.trafficlights.domain.LightState;

public class FirstLightSwitchingCrossingController {

	public void setFirstLight(LightState state) {
	}

	public void setSecondLight(LightState state) {
	}
	
	public LightState firstLight() {
		return LightState.YELLOW;
	}
	
	public LightState secondLight() {
		return LightState.RED;
	}
}
