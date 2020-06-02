package chapter3.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {

  public static void addSound(List<? super String> list) {    // lower bound
    list.add("quack");
  }

  public static void main(String[] args) {
    List<String> strings = new ArrayList<String>();
    strings.add("tweet");
    List<Object> objects = new ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);
  }
}
