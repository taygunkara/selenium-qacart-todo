package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {

    public static Properties readProperties(){
        Properties properties = null;
        InputStream inputStream;

        try {
            String env = System.getProperty("env", "PRODUCTION");
            switch (env){
                case "PRODUCTION"-> inputStream = new FileInputStream("src/test/resources/env/production.properties");
                case "LOCAL"-> inputStream = new FileInputStream("src/test/resources/env/local.properties");
                default -> throw new RuntimeException("Property is not supported!");
            }
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
