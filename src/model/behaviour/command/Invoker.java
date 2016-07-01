package model.behaviour.command;

public class Invoker implements Command{

	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}

	@Override
	public void exe() {
		command.exe();
	}
	
	
}
