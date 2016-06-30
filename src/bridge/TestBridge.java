package bridge;

import org.junit.Test;

/**
 * 测试桥接模式
 * @author yujiansong
 *
 */
public class TestBridge {

	//桥接模式测试一
//	@Test
	public void TestBridge1(){
		
		DriverManager driverManager = new MyDriverManager();
		Driver mysqlDriver = new MysqlDriver();
		driverManager.setDriver(mysqlDriver);
		driverManager.connet();
		
		DriverManager driverManager2 = new MyDriverManager();
		Driver oracle = new Oracle();
		driverManager2.setDriver(oracle);
		driverManager2.connet();
	}

	//桥接模式测试二
	@Test
	public void TestBridge2(){
		
		DriverManager driverManager = new MyDriverManager2();
		Driver mysqlDriver = new MysqlDriver();
		driverManager.setDriver(mysqlDriver);
		driverManager.connet();
		
		DriverManager driverManager2 = new MyDriverManager2();
		Driver oracle = new Oracle();
		driverManager2.setDriver(oracle);
		driverManager2.connet();
	}
}