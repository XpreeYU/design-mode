package factory.create;

import factory.classs.MyClassOne;
import factory.classs.MyClassTwo;

/**
 * 多个工厂方法模式
 * @author yujiansong
 *
 */
public class MyfactoryMore {

	//1.返回ClassOne
	public MyClassOne produceOne(){

		return new MyClassOne();
	}
	
	//2.返回ClassTwo
	public MyClassTwo produceTwo(){
		
		return new MyClassTwo();
	}
	
}
