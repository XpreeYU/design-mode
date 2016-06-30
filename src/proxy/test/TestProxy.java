package proxy.test;

import org.junit.Test;

import proxy.Proxy;
import proxy.Sourceable;

/**
 * 测试代理模式
 * @author yujiansong
 *
 */
public class TestProxy {

	@Test
	public void testProxy(){
		Sourceable source = new Proxy();
		source.method();
	}
}
