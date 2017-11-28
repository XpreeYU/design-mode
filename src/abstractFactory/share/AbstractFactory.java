package abstractFactory.share;
/**
 * 抽象工厂，定义了生产族产品的方法；  
 * @author yujiansong
 *	  @date 2017年11月28日
 */
public interface AbstractFactory {  
    public ProductA factoryA();  
    public ProductB factoryB();  
}  