package map.properties;

import java.io.*;
import java.util.Properties;

public class LoadProperties {

    public static void main(String[] args) throws IOException {

        Properties props = new Properties();
        props.load(new FileInputStream(args[0]));

        System.out.println(props.getProperty("map.properties.username"));
        System.out.println(props.getProperty("map.properties.password"));
    }
}
