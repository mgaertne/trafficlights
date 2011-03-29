package org.trafficlights.test.acceptance;

import org.trafficlights.domain.LightState;

public class TrafficLights {

	private LightState state;
	
	public void setPreviousState(LightState state) {
		this.state = state;
	}
	
	public LightState nextState() {
		return state.next();
	}
	
}
