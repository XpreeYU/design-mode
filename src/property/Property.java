package property;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式
 * @author yujiansong
 *
 */
public class Property implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private Integer obj;
	
	/**
	 * 1.实现对象的浅复制
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public Object clone() throws CloneNotSupportedException{
		// 因为Cloneable接口是个空接口，你可以任意定义实现类的方法名
        // 如cloneA或者cloneB，因为此处的重点是super.clone()这句话
        // super.clone()调用的是Object的clone()方法
        // 而在Object类中，clone()是native（本地方法）的
		Property property = (Property) super.clone();
		
		return property;
	}
	
	/**
	 * 2.实现对象的深复制
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		//a.将对象以二进制的形式写出
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//b.将对象以二进制的形式读入
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);

		return ois.readObject();
	}

	//设置该对象的相关属性
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getObj() {
		return obj;
	}

	public void setObj(Integer obj) {
		this.obj = obj;
	}
	
}
