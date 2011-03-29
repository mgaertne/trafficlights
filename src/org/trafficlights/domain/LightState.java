package org.trafficlights.domain;

public enum LightState {
	RED("red") {
		public LightState next() { return RED_YELLOW; }
	},
	RED_YELLOW("red, yellow") {
		public LightState next() { return GREEN; }
	},
	GREEN("green") {
		public LightState next() { return YELLOW; }
	},
	YELLOW("yellow") {
		public LightState next() { return RED; }
	},
	UNKNOWN("yellow blink");

	public static LightState valueFor(String stateName) {
		for (LightState state: values()) {
			if (state.description.equals(stateName)) return state;
		}
		return UNKNOWN;
	}
	
	String description;
	
	private LightState() {
		this("");
	}
	
	private LightState(String description) {
		this.description = description;
	}
	
	public LightState next() {
		return UNKNOWN;
	}

}
