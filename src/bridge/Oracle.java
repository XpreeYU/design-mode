package bridge;

public class Oracle implements Driver {

	@Override
	public void connect() {
		System.out.println("获取Oracle数据库驱动");
	}

}
