package org.trafficlights.domain;


public class CrossingValidator {

	public boolean isValidConfiguration(LightState firstState, LightState secondState) {
		if (LightState.UNKNOWN.equals(firstState)) return false;
		if (LightState.RED.equals(secondState)) return true;
		if (LightState.RED.equals(firstState) && LightState.GREEN.equals(secondState)) return true;
		return false;
	}
	
}