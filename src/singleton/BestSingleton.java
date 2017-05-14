package singleton;
/**
 * 比较好的单例模式创建方式，多线程下安全
 * @author yujiansong
 *	  @date 2017年5月2日
 */
public class BestSingleton {

    private BestSingleton(){};
    private static volatile BestSingleton instace;
    
    public static BestSingleton getInstace() {
        //对象实例化时与否判断（不使用同步代码块，instance不等于null时，直接返回对象，提高运行效率）
        if (instace == null) {
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
            synchronized (BestSingleton.class) {
                if (instace == null) {
                    instace = new BestSingleton();
                }
            }
        }
        return instace;
    }
}
