package adaptor.test2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
/**
 * 
 * @author Administrator
 * @date 2017年4月23日
 */
public class FileProperties implements FileIo {

    private Properties properties;
    private Map<String, String> valueMap;
    public FileProperties() {
        this.properties = new Properties();
        this.valueMap = new HashMap<>();
    }
    
    @Override
    public void readfromFile(String fileName) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(fileName));
        properties.load(is);
        Iterator<String> iterable = properties.stringPropertyNames().iterator();
        while (iterable.hasNext()) {
            String key = iterable.next();
            System.out.println(key + "=" + properties.getProperty(key));
        }
        
        is.close();
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        FileOutputStream oFile = new FileOutputStream(fileName, true);
        Iterator<Entry<String, String>> it = valueMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            properties.setProperty(entry.getKey(), entry.getValue());
        }
        properties.store(oFile, "The New file");
        oFile.close();
    }

    @Override
    public void setValue(String key, String value) {
        valueMap.put(key, value);
    }

    @Override
    public String getValue(String key) {
        return valueMap.get(key);
    }

}
