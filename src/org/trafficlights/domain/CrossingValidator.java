package org.trafficlights.domain;


public class CrossingValidator {

	public boolean isValidConfiguration(LightState firstState, LightState secondState) {
		return !LightState.UNKNOWN.equals(firstState) && LightState.RED.equals(secondState);
	}
	
}