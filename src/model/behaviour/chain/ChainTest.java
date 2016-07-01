package model.behaviour.chain;

import org.junit.Test;

/**
 * 测试责任链模式
 * @author yujiansong
 *
 */
public class ChainTest {

	@Test
	public void testChian(){
		Myhandler handler = new Myhandler("h1");
		Myhandler handler2 = new Myhandler("h2");
		Myhandler handler3 = new Myhandler("h3");
		
		handler.setHandler(handler2);
		handler2.setHandler(handler3);
		
		handler.operator();
	}
}
