package abstractFactory.share;
public class ConcreateFactory2 implements AbstractFactory {  
  
    //生产等级为2的产品A  
    @Override  
    public ProductA factoryA() {  
        // TODO Auto-generated method stub  
        return new ConcreateProductA2();  
    }  
  
    //生产等级为2的产品B  
    @Override  
    public ProductB factoryB() {  
        // TODO Auto-generated method stub  
        return new ConcreateProductB2();  
    }  
} 