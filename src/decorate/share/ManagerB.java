package decorate.share;
public class ManagerB extends Manager {
    private Person person;//给雇员升职
    
    public ManagerB(Person person) {
        super();
        this.person = person;
    }
    @Override
    public void doCoding() {
        person.doCoding();
        doEndWork();
    }
    /**
     * 项目经理开始项目收尾工作
     */
    public void doEndWork() {
        System.out.println("项目经理B 在做收尾工作");
    }
    
}