package facade;

import org.junit.Test;

//测试外观模式
public class TestFacade {

	@Test
	public void testFacade(){
		Computer computer = new Computer();
		computer.startUp();
		
		System.out.println("------------------------");
		
		computer.shutdown();
	}
}
