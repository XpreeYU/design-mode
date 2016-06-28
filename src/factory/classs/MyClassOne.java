package factory.classs;

/**
 * 实现公共接口的类一，重写print方法
 * @author yujiansong
 *
 */
public class MyClassOne implements MyInterface {

    @Override
    public void print() {
        System.out.println("MyClassOne");
    }

}