package org.trafficlights.domain;

import java.beans.PropertyEditorSupport;

public class LightStateEditor extends PropertyEditorSupport {

	public void setAsText(String state) {
		if ("red".equals(state)) {
			setValue(LightState.RED);
			return;
		}
		if ("red, yellow".equals(state)) {
			setValue(LightState.RED_YELLOW);
			return;
		}
		setValue(LightState.GREEN);
	}
}
