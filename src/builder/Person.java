package builder;

/**
 * 建造者模式，创建一个人：head + body + foot = person
 * @author yujiansong
 *
 */
public class Person {

	private String head;
    private String body;
    private String foot;
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFoot() {
		return foot;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
    
}
