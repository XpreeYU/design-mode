package model.behaviour.undefined;

/**
 * 备份类
 * @author yujiansong
 *
 */
public class Memento {

	private String value;

	public Memento(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
