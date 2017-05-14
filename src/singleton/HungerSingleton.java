package singleton;

/**
 * 
 * @author yujiansong
 *	  @date 2017年5月2日
 */
public class HungerSingleton {
    private HungerSingleton(){};
    private static final HungerSingleton instace = new HungerSingleton();

    public HungerSingleton getInstance(){
        return instace;
    }
}
