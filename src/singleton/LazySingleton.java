package singleton;
/**
 * 
 * @author yujiansong
 *	  @date 2017年5月2日
 */
public class LazySingleton {
    public LazySingleton(){}
    
    private static LazySingleton instance= null;
    
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    
}
