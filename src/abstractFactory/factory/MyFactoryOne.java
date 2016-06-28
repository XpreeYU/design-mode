package abstractFactory.factory;

import abstractFactory.classs.MyClassOne2;
import abstractFactory.classs.MyInterface2;
import abstractFactory.provider.Provider;

/**
 * 返回具体工厂类ClassOne
 * @author yujiansong
 *
 */
public class MyFactoryOne implements Provider{

	@Override
	public MyInterface2 produce() {
		return new MyClassOne2();
	}

}
