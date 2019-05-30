package chapter7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {
  private Map<String,Object> foodData = new HashMap<String,Object>();
  public synchronized void put(String key, String value) {
    foodData.put(key, value);
  }
  public synchronized Object get(String key) {
    return foodData.get(key);
  }

  public static void main(String[] args) {
//    Map<String, Object> foodData = new HashMap<>();
//    foodData.put("penguin", 1);
//    foodData.put("flamingo", 2);
//    for(String key: foodData.keySet()) //ConcurrentModificationException
//      foodData.remove(key);

    Map<String, Object> foodData2 = new ConcurrentHashMap<>();
    foodData2.put("penguin", 1);
    foodData2.put("flamingo", 2);
    for(String key: foodData2.keySet())
      foodData2.remove(key);
  }
}
