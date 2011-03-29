
public class TrafficLights {

	private String state;
	
	public void setPreviousState(String state) {
		this.state = state;
	}
	
	public String nextState() {
		if ("red".equals(state)) return "red, yellow";
		return "green";
	}
	
}
