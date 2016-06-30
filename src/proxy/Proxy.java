package proxy;

public class Proxy implements Sourceable {
	
	private Sourceable source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	
	public void after(){
		System.out.println("在后面");
	}
	
	public void before(){
		System.out.println("在前面");
	}
}
