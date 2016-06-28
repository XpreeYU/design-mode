package abstractFactory.test;

import org.junit.Test;

import abstractFactory.classs.MyInterface2;
import abstractFactory.factory.MyFactoryTwo;
import abstractFactory.provider.Provider;

/**
 * 测试抽象工厂模式
 * @author yujiansong
 *
 */
public class TestAbstractFactory {

	@Test
	public void abstractFactory(){
		Provider provider = new MyFactoryTwo();
		MyInterface2 interface2 = provider.produce();
		interface2.print();
	}
}
