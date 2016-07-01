package model.behaviour.status;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Context {

	private State state;
	
	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void method(){
		System.out.println("状态为" + state.getState());
		if (state.getState().equals("state1")) {
			state.method1();
		}else if (state.getState().equals("state2")) {
			state.method2();
		}
	}
}
