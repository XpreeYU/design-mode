package model.behaviour.status;

/**
 * 状态模式
 * @author yujiansong
 *
 */
public class State {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void method1(){
		System.out.println("this is method1");
	}
	
	public void method2(){
		System.out.println("this is method2");
	}
}
