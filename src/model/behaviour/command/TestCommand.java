package model.behaviour.command;

import org.junit.Test;

/**
 * 测试命令模式
 * @author yujiansong
 *
 */
public class TestCommand {

	@Test
	public void testCommand(){
		
		Receiver receiver = new Receiver();
		Command command = new MyCommand(receiver);

		Invoker invoker = new Invoker(command);
		invoker.exe();
	}
}
