package factory.create;

import factory.classs.MyClassOne;
import factory.classs.MyClassTwo;
import factory.classs.MyInterface;

/**
 * 工厂类
 * @author yujiansong
 *
 */
public class MyFactory {

	public MyInterface produce(String type){
		if (type.equals("one")) {
		
			return new MyClassOne();
		}else if (type.equals("two")) {
			
			return new MyClassTwo();
		}else {
			
			System.out.println("没有要找的类型");
			return null;
		}
		
	}
}
