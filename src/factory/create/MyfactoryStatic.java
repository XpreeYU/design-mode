package factory.create;

import factory.classs.MyClassOne;
import factory.classs.MyClassTwo;

/**
 * 静态工厂模式
 * @author yujiansong
 *
 */
public class MyfactoryStatic {

	//1.返回ClassOne
	public static MyClassOne produceOne(){

		return new MyClassOne();
	}
	
	//2.返回ClassTwo
	public static MyClassTwo produceTwo(){
		
		return new MyClassTwo();
	}
}
