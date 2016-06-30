package bridge;

public class MyDriverManager2 extends DriverManager {
	
	public void connet(){
		System.out.println("在前面");
		super.connet();
		System.out.println("在后面");
	}
}
