package chapter3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBounded {

  public static void main(String[] args) {
//    ArrayList<Number> list = new ArrayList<Integer>();  //DOES NOT COMPILE
    List<? extends Number> list = new ArrayList<Integer>();
//    list.add(Integer.valueOf(1));
    List<Integer> li = Arrays.asList(1, 2, 3);
    total(li);

    List<? extends Bird> birds = new ArrayList<Bird>();
//    birds.add(new Sparrow());         // DOES NOT COMPILE
//    birds.add(new Bird());            // DOES NOT COMPILE

    HangGlider hangGlider = new HangGlider();
    Goose goose = new Goose();
    List<Flyer> flyers = new ArrayList<>();
    flyers.add(hangGlider);
    flyers.add(goose);
    anyFlyer(flyers);

    List<Goose> geese = new ArrayList<>();
    geese.add(new Goose());
    geese.add(new Goose());

//    anyFlyer(geese);
    groupOfFlyers(geese);

  }

  public static long total(List<? extends Number> list) {
    long count = 0;
    for (Number number: list)
      count += number.longValue();
    return count;
  }

  static class Bird { }
  static class Sparrow extends Bird { }

  interface Flyer { void fly(); }
  static class HangGlider implements Flyer { public void fly() {} }
  static class Goose implements Flyer { public void fly() {} }

  private static void anyFlyer(List<Flyer> flyer) {}
  private static void groupOfFlyers(List<? extends Flyer> flyer) {}
}
