package decorate.share;
public class Employee implements Person {

    @Override
    public void doCoding() {
        System.out.println("程序员加班写程序啊，写程序，终于写完了。。。");
    }

}