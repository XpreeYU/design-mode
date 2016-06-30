package decorate;

/**
 * 对象的实体
 * @author yujiansong
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {

		System.out.println("我是真正的对象");	
	}

}
