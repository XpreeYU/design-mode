package abstractFactory.share;
//ConcreateFactory1是用来生产等级为1的产品A，B；  
public class ConcreateFactory1 implements AbstractFactory {  
  
    //生产等级为1的产品A  
    @Override  
    public ProductA factoryA() {  
        // TODO Auto-generated method stub  
        return new ConcreateProductA1();  
    }  
  
      
    //生产等级为1的产品B  
    @Override  
    public ProductB factoryB() {  
        // TODO Auto-generated method stub  
        return new ConcreateProductB1();  
    }  
  
} 