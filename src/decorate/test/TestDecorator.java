package decorate.test;

import org.junit.Test;

import decorate.Decorator;
import decorate.Source;
import decorate.Sourceable;

/**
 * 测试装饰器模式
 * @author yujiansong
 *
 */
public class TestDecorator {

	/**（1） 装饰对象和真实对象有相同的接口。这样客户端对象就能以和真实对象相同的方式和装饰对象交互。
	        （2） 装饰对象包含一个真实对象的引用（reference）
	        （3） 装饰对象接受所有来自客户端的请求。它把这些请求转发给真实的对象。
	        （4） 装饰对象可以在转发这些请求以前或以后增加一些附加功能。这样就确保了在运行时，不用修改给定对象的结构就可以在外部增加附加的功能。
	            在面向对象的设计中，通常是通过继承来实现对给定类的功能扩展。
	            继承不能做到这一点，继承的功能是静态的，不能动态增删。
	 */
	@Test
	public void testDecorator(){
		Sourceable source = new Source();
		
		//传入真正的实体对象进入装饰器类
		Sourceable decorator = new Decorator(source);
		//装饰器对象调用，并添加一些附加功能
		decorator.method();
		
		//真实对象调用自己的方法
		source.method();
	}
}
