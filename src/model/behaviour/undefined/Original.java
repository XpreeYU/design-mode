package model.behaviour.undefined;

/**
 * 原始类
 * @author yujiansong
 *
 */
public class Original {
	private String value;

	public Original(String value) {
		this.value = value;
	}
	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memento createMemento(){  
        return new Memento(value);  
    }  

	//重新设置原始对象属性
    public void restoreMemento(Memento memento){  
        this.value = memento.getValue();  
    }  
}
