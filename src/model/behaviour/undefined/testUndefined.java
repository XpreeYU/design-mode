package model.behaviour.undefined;

import org.junit.Test;

/**
 * 测试备份模式
 * @author yujiansong
 *
 */
public class testUndefined {

	@Test
	public void testUndefined(){
		
		//创建原始类
		Original original = new Original("yujiansong");
		//创建备份类
		Storage storage = new Storage(original.createMemento());
		
		//修改原始类的属性
		System.out.println("初始化属性为：" + original.getValue());
		original.setValue("good bye");
		System.out.println("修改后的属性值" + original.getValue());
		
		//回复原来的属性值
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的属性值为：" + original.getValue());
		
	}
}
