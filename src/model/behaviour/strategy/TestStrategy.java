package model.behaviour.strategy;

import org.junit.Test;

/**
 * 测试策略模式
 * @author yujiansong
 *
 */
public class TestStrategy {

	@Test
	public void testStrategy(){
		
		String exp = "8-2";
		String exp2 = "8*2";
		//测试加法
		ICalculator iCalculator = new Minus();
		int result = iCalculator.calculate(exp);
		System.out.println(exp + "=" +result);
		
		//测试乘法
		ICalculator iCalculator2 = new Multiply();
		int result2 = iCalculator2.calculate(exp2);
		System.out.println(exp2 + "=" + result2);
	}
}
