package adaptor.test;

import org.junit.Test;

import adaptor.classAdaptor.Adapter;
import adaptor.classAdaptor.TargetTable;
import adaptor.interfaceAdaptor.NeedClass;
import adaptor.objAdaptor.SourceObj;
import adaptor.objAdaptor.TargetTableObj;
import adaptor.objAdaptor.Wrapper;

public class TestAdaptor {

	//1.测试类适配器
//	@Test
	public void testClassAdaptor(){
		
		TargetTable table = new Adapter();
		table.method1();
		table.method2();
	}
	
	//2.测试对象适配器
//	@Test
	public void testObjAdaptor(){
		
		SourceObj sourceObj = new SourceObj();
		TargetTableObj tableObj = new Wrapper(sourceObj);
		tableObj.method1();
		tableObj.method2();
	}
	
	//3.测试接口适配器
	@Test
	public void testInterfaceAdaptor(){
		
		NeedClass class1 = new NeedClass();
		class1.method2();
		class1.method4();
	}
}
