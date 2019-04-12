package chapter5;

import java.util.Locale;

public class PickingLocale {

  public static void main(String[] args) {
    Locale locale = Locale.getDefault();
    System.out.println(locale);

    System.out.println(Locale.GERMAN); // de
    System.out.println(Locale.GERMANY); // de_DE

    System.out.println(new Locale("fr")); // fr
    System.out.println(new Locale("hi", "IN")); // hi_IN

    Locale l1 = new Locale.Builder()
        .setLanguage("en")
        .setRegion("US")
        .build();

    System.out.println(l1);

    Locale l2 = new Locale.Builder()
        .setRegion("US")
        .setLanguage("en")
        .build();

    System.out.println(l2);

    Locale l3 = new Locale.Builder() // bad but legal
        .setRegion("us") //should be in uppercase
        .setLanguage("EN") //should be in lowercase
        .build();

    System.out.println(l3);

    //Locale changes only for that one Java program. It does not
    // change any settings on your computer. It does not even change future programs.

    System.out.println(Locale.getDefault()); // en_US
    Locale locale2 = new Locale("fr");
    Locale.setDefault(locale2); // change the default
    System.out.println(Locale.getDefault()); // fr
  }

}
