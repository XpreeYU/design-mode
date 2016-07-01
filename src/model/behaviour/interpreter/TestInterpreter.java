package model.behaviour.interpreter;

import org.junit.Test;

/**
 * 解释器模式
 * @author yujiansong
 *
 */
public class TestInterpreter {

	@Test
	public void testInterpreter(){
		
		 // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
	}
}
