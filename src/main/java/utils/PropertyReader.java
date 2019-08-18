package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String getValue(String key) {

        try {
            FileInputStream file = new FileInputStream
                    ("/Users/kumarbekchaldanbaev/Desktop/HomeDepotMyAccount/" +
                            "src/main/resources/homedepot.properties");
            Properties properties = new Properties();
            properties.load(file);
            return properties.getProperty(key);
        } catch (FileNotFoundException e) {
            System.out.println("application.properties cannot be read");
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            System.out.println("application.properties file cannot be loaded");
            e.printStackTrace();
            return null;
        }

    }
}
