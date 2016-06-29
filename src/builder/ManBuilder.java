package builder;

/**
 * ConcreteBuilder（实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。）
 * @author yujiansong
 *
 */
public class ManBuilder implements PersonBuilder {

	Person person;
	
	//构造器
	public ManBuilder() {
		person = new Person();
	}
	
	@Override
	public void buildHead() {
		person.setHead("构造heard");
	}

	@Override
	public void buildBody() {
		person.setBody("构造Body");
	}

	@Override
	public void buildFoot() {
		person.setFoot("构造Foot");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
