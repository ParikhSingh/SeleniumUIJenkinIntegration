package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {

        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/ConfigFiles/config.properties");

            properties = new Properties();


            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  static  String getProperty(String key) {

        return properties.getProperty(key);
    }
}




