package iterator;

import org.junit.Test;

/**
 * 测试迭代模式
 * @author yujiansong
 *
 */
public class TestIterator {

	@Test
	public void testIterator(){
		String string[] = { "A", "B", "C", "D", "E" };
		Collection collection = new MyCollection(string);
		Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
