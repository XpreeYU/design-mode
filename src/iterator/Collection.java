package iterator;

/**
 * 迭代子模式
 * @author yujiansong
 *
 */
public interface Collection {

	public Iterator iterator();
	
	//迭代元素
	public Object get(int i);
	
	//获取集合大小
	public int size();
}
