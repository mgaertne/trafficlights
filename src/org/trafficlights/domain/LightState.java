package org.trafficlights.domain;

public enum LightState {
	RED("red") {
		public LightState next() { return RED_YELLOW; }
	},
	RED_YELLOW {
		public LightState next() { return GREEN; }
	},
	GREEN {
		public LightState next() { return YELLOW; }
	},
	YELLOW {
		public LightState next() { return RED; }
	},
	UNKNOWN;

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
