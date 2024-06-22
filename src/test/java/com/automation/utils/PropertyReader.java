package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
    static Properties property;

    public static void initProperty() {
        property = new Properties();

        try {
            property.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){

        return property.getProperty(key);

    }



}
