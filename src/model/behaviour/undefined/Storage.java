package model.behaviour.undefined;

/**
 * 保存备份类
 * @author yujiansong
 *
 */
public class Storage {

	private Memento memento;
	
	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
