package builder;

import org.junit.Test;

/**
 * 测试构造者模式
 * @author yujiansong
 *
 */
public class test {

	@Test
	public void testBuilderMode(){
		PersonDirector pd = new PersonDirector();
		Person man = pd.consternatPerson(new ManBuilder());
		
		System.out.println(man.getHead());
		System.out.println(man.getBody());
		System.out.println(man.getFoot());
	}
}
