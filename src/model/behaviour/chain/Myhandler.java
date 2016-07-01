package model.behaviour.chain;

public class Myhandler extends AbstractHandler implements Handler {

	private String name;
	
	public Myhandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println(name + "deal");
		if (getHandler() != null) {
			getHandler().operator();
		}
	}

}
