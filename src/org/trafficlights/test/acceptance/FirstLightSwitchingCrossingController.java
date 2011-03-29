package org.trafficlights.test.acceptance;

import org.trafficlights.domain.CrossingValidator;
import org.trafficlights.domain.LightState;

public class FirstLightSwitchingCrossingController {

	private LightState firstState;
	
	private LightState secondState;

	private CrossingValidator validator;
	
	public void setFirstLight(LightState state) {
		firstState = state;
	}

	public void setSecondLight(LightState state) {
		secondState = state;
	}
	
	public void execute() {
		switchFirstLight();
	}

	public void switchFirstLight() {
		validator = new CrossingValidator();
		if (!validator.isValidConfiguration(firstState, secondState)) {
			warningConfiguration();
			return;
		}
		firstState = firstState.next();
	}

	private void warningConfiguration() {
		firstState = LightState.UNKNOWN;
		secondState = LightState.UNKNOWN;
	}
	
	public LightState firstLight() {
		return firstState;
	}
	
	public LightState secondLight() {
		return secondState;
	}
}
