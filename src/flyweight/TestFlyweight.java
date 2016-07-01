package flyweight;

import java.sql.Connection;

import org.junit.Test;

/**
 * 测试享元模式
 * @author yujiansong
 *
 */
public class TestFlyweight {

	@Test
	public void testFlyweight(){
		//获取连接池信息
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		//获取一个连接用于操作数据库
		Connection conn = connectionPool.getConnection();
	}
}
