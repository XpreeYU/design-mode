package adaptor.classAdaptor;

/**
 * 类适配器
 * @author yujiansong
 *
 */
public class Adapter extends Source implements TargetTable {

	//重写method2方法
	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
