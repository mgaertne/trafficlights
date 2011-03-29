package org.trafficlights.domain;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

import static org.trafficlights.domain.LightState.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LightStateEditorTest {

	@Parameters
	public static List<Object[]> data() {
		return asList(new Object[][] {
				{ "red", RED },
				{ "red, yellow", RED_YELLOW },
				{ "green", GREEN },
				{ "yellow", YELLOW },
				{ "yellow blink", UNKNOWN }
		});
	}
	
	private LightStateEditor editor = new LightStateEditor();
	private String stateName;
	private LightState state;
	
	public LightStateEditorTest(String stateName, LightState state) {
		this.stateName = stateName;
		this.state = state;
	}
	
	@Test
	public void setAsText() {
		editor.setAsText(stateName);
		assertEquals(state, editor.getValue());
	}

	@Test
	public void getAsText() {
		editor.setValue(state);
		assertEquals(stateName, editor.getAsText());
	}
}
