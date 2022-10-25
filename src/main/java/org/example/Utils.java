package org.example;


import java.io.IOException;
import java.util.Properties;

public class Utils {

    public static String getConfigValue(String param) {
        Properties prop = new Properties();
        try {
            prop.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return prop.getProperty(param);
    }
}