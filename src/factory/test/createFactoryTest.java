package factory.test;

import org.junit.Test;
import factory.classs.MyClassTwo;
import factory.classs.MyInterface;
import factory.create.MyFactory;
import factory.create.MyfactoryMore;
import factory.create.MyfactoryStatic;

/**
 * 测试工厂方法模式
 * @author yujiansong
 *
 */
public class createFactoryTest {

	//创建工厂模式测试
	@Test
	public void createFactory(){
		MyFactory factory = new MyFactory();
		MyInterface myInterface = factory.produce("one");
		myInterface.print();
	}
	
	//创建多个工厂测试
	@Test
	public void createMoreFactory(){
		MyfactoryMore myfactoryMore = new MyfactoryMore();
		MyClassTwo two = myfactoryMore.produceTwo();
		two.print();
	}
	
	//创建静态工厂模式
	@Test
	public void createStaticFactory(){
		MyInterface classOne = MyfactoryStatic.produceOne();
		classOne.print();
	}
}
