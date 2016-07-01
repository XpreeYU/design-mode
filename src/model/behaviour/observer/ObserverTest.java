package model.behaviour.observer;

import org.junit.Test;

/**
 * 测试策略模式
 * @author yujiansong
 *
 */
public class ObserverTest {

	@Test
	public void testObserver(){
		Subject subject = new MySubject();
		Observer observer = new Observer1();
		Observer observer2 = new Observer2();
		//添加通知的对象
		subject.add(observer);
		subject.add(observer2);
		
		//删除要通知的对象
	//	subject.del(observer);
		
		subject.operation();
	}
}
