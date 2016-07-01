package model.behaviour.template;

import org.junit.Test;

/**
 * 测试模板模式
 * @author yujiansong
 *
 */
public class TestTemplate {

	@Test
	public void testTemplate(){
		
		String exp = "8+8";
		AbstractCalculatorTemplate template = new Plus();
		int result = template.calculate(exp, "\\+");
		System.out.println(exp + "=" +result);
	}
}
