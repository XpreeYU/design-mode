package abstractFactory.classs;

/**
 * 实现公共接口的类一，重写print方法
 * @author yujiansong
 *
 */
public class MyClassOne2 implements MyInterface2 {

    @Override
    public void print() {
        System.out.println("MyClassOne");
    }

}