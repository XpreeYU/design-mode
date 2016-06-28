package abstractFactory.factory;

import abstractFactory.classs.MyClassTwo2;
import abstractFactory.classs.MyInterface2;
import abstractFactory.provider.Provider;

public class MyFactoryTwo implements Provider {

	@Override
	public MyInterface2 produce() {
		return new MyClassTwo2();
	}

}
