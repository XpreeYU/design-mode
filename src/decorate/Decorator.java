package decorate;

/**
 * 装饰器类
 * @author yujiansong
 *
 */
public class Decorator implements Sourceable {

	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		
		System.out.println("在前面");
		source.method();
		System.out.println("在后面");
	}

}
