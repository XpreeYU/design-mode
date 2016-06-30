package bridge;

public class MysqlDriver implements Driver {

	@Override
	public void connect() {
		System.out.println("获取Mysql数据库驱动！");
	}

}
