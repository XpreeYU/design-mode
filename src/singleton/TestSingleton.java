package singleton;

import org.junit.Test;

/**
 * 测试创建一个单例模式的实例
 * @author yujiansong
 *
 */
public class TestSingleton {

	@Test
	public void createSingleton(){
		//创建的是同一个对象
		MyObject object = MyObject.getInstance();
		System.out.println(object.toString());//---->singleton.MyObject@24859367

		MyObject object2 = MyObject.getInstance();
		System.out.println(object2.toString());//---->singleton.MyObject@24859367
		
		//创建枚举类实现的单例
		SingleEnum single = SingleEnum.INSTANCE;
		System.out.println(single.toString());//------>single
	}
}
