package adaptor.objAdaptor;

/**
 * 对象适配器
 * @author yujiansong
 *
 */
public class Wrapper implements TargetTableObj {

	private SourceObj sourceObj;
	
	public Wrapper(SourceObj sourceObj) {
		super();
	   this.sourceObj = sourceObj;
	}
	
	
	//重写method2方法
	@Override
	public void method2() {
		System.out.println("this is the targetableObj method!");
	}


	@Override
	public void method1() {
		sourceObj.method1();
	}


}
