package org.trafficlights.domain;

public enum LightState {
	RED {
		public LightState next() { return RED_YELLOW; }
	},
	RED_YELLOW {
		public LightState next() { return null; }
	};

	public abstract LightState next();

}
