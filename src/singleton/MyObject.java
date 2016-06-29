package singleton;

/**
 * 单例模式
 * @author yujiansong
 * 注:是线程不安全的
 */
public class MyObject {

	private static MyObject myObject;
	
	//创建私有构造器
	private MyObject(){
		
	}
	
	public static MyObject getInstance(){
		
		if (myObject != null) {
			
		}else {
			 myObject = new MyObject();
		}
	
		return myObject;
	}
}
