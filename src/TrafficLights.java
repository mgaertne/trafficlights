
public class TrafficLights {

	private String state;
	
	public void setPreviousState(String state) {
		this.state = state;
	}
	
	public String nextState() {
		if ("red".equals(state)) return "red, yellow";
		if ("red, yellow".equals(state)) return "green";
		if ("green".equals(state)) return "yellow";
		if ("yellow".equals(state)) return "red";
		return "yellow blink";
	}
	
}
