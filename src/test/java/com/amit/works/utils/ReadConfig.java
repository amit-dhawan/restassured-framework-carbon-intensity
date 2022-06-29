package com.amit.works.utils;

import java.io.*;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadConfig {

    private static File file;
    private static Properties prop;
    private static InputStream inputStream;

    public static void loadConfig() throws IOException {
        try {

            inputStream = new FileInputStream("src/test/resources/globalconfig/config.properties");
            prop = new Properties();
            prop.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }

    }

    public static String getProperty(String key) throws IOException {
        loadConfig();
        String value = prop.getProperty(key);
        return value;

    }


}
