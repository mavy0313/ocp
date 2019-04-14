package chapter5;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ZooOpen {

    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");

        printProperties(us);
        System.out.println();
        printProperties(france);

        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);

        Properties props = new Properties();
        rb.keySet()
                .forEach(k -> props.put(k, rb.getString(k)));

        System.out.println(props.getProperty("notReallyAProperty"));
        System.out.println(props.getProperty("notReallyAProperty", "123"));
    }

    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }
}
