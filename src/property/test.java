package property;

import java.io.IOException;

import org.junit.Test;

/**
 * 测试原型模式
 * @author yujiansong
 *
 */
public class test {

	@Test
	public void testProperty() throws CloneNotSupportedException, ClassNotFoundException, IOException{
		
		Property property = new Property();
		property.setId(0);
		property.setObj(123);
		
		Property property2 = (Property) property.clone();
		Property property3 = (Property) property.deepClone();
		
		System.out.println(property2.getObj() == property.getObj());
		System.out.println(property3.getObj() == property.getObj());
		
	}
}
