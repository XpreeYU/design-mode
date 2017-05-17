package adaptor.test2;

import java.io.IOException;

/**
 * 
 * @author Administrator
 * @date 2017年4月23日
 */
public interface FileIo {
    public void readfromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
