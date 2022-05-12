package chapter3.generics;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {

  public static void printList(List<Object> list) {
    for (Object x: list) System.out.println(x);
  }

  public static void main(String[] args) {
    List<String> keywords = new ArrayList<>();
    keywords.add("java");
//    printList(keywords);    // DOES NOT COMPILE

    List<Integer> numbers = new ArrayList<>();
    numbers.add(new Integer(42));
//    List<Object> objects = numbers;   // DOES NOT COMPILE
//    objects.add("forty two");
//    System.out.println(numbers.get(1));

    Object[] o = new String[0];
    Integer[] numbers2 = { new Integer(42)};
    Object[] objects = numbers2;
    objects[0] = "forty two"; //ArrayStoreException
  }

}
