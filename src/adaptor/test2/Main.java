package adaptor.test2;

import java.io.IOException;

/**
 * @author Administrator
 * @date 2017年4月23日
 */
public class Main {

    public static void main(String[] args) {
        FileIo f = new FileProperties();
        try {
            f.readfromFile("E:\\workspace\\javaTestFile\\file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("E:\\workspace\\javaTestFile\\newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
