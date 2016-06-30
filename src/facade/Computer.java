package facade;

/**
 * 外观模式----->模仿一台计算机启动过程
 * @author yujiansong
 *
 */
public class Computer {

	private CPU cpu;
	private Disk disk;
	private Memory memory;
	
	
	public Computer() {
		this.cpu = new CPU();
		this.disk = new Disk();
		this.memory = new Memory();
	}
	
	public void startUp(){
		System.out.println("startUp computer！");
		cpu.startup();
		disk.startup();
		memory.startup();
		System.out.println("startUp computer end");
	}
	
	public void shutdown(){
		System.out.println("shutdown computer!");
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
		System.out.println("shutdown computer end!");
	}
}
