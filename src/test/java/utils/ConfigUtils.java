package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {

    public static Properties readProperties(){
        Properties properties = null;
        try {
            InputStream inputStream = new FileInputStream("src/test/resources/env/production.properties");
            properties = new Properties();
            properties.load(inputStream);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

        return properties;
    }

    public Object getBaseURL(){
        return readProperties().get("URL");
    }

}
