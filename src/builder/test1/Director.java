package builder.test1;
/**
 * 
 * @author yujiansong
 *	  @date 2017年5月4日
 */
public class Director {

    private Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public void construct(){
        builder.builderPart1();
        builder.builderPart2();
    }
}
