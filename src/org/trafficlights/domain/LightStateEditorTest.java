package org.trafficlights.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightStateEditorTest {

	private LightStateEditor editor = new LightStateEditor();
	
	@Test
	public void testname() {
		editor.setAsText("red");
		assertEquals(LightState.RED, editor.getValue());
		
	}
}
