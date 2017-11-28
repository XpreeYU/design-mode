package adaptor.interfaceAdaptor;

/**
 * 我们写一个类，继承该抽象类，重写我们需要的方法就行了
 * @author yujiansong
 * 接口的适配器是这样的：有时我们写的一个接口中有多个抽象方法，
 * 当我们写该接口的实现类时，必须实现该接口的所有方法，这明显有时比较浪费，因为并不是所有的方法都是我们需要的
 *，有时只需要某一些，此处为了解决这个问题，我们引入了接口的适配器模式，借助于一个抽象类，
 * 该抽象类实现了该接口，实现了所有的方法，而我们不和原始的接口打交道，只和该抽象类取得联系，所以我们写一个类，继承该抽象类，重写我们需要的方法就行了。
 *
 */
public class NeedClass extends AbstractClass {

	//重写父类的method2方法  --->overrides adaptor.interfaceAdaptor.AbstractClass.method2
    @Override
	public void method2(){
		System.out.println("I'm method2");
	}
	
	//重写父类的method4方法 --->overrides adaptor.interfaceAdaptor.AbstractClass.method4
    @Override
	public void method4(){
		System.out.println("I'm method4");
	}
}
