package model.behaviour.status;

import org.junit.Test;

/**
 * 测试状态模式
 * @author yujiansong
 *
 */
public class StatusTest {

	@Test
	public void testState(){
		
		State state = new State();
		Context context = new Context(state);
		state.setState("state1");
		context.method();
		
		state.setState("state2");
		context.method();
		
		
	}
}
