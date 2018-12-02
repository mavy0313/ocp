package chapter3.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonCollectionsMethods {

    public static void main(String[] args) {

        //add
        System.out.println("add()");

        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false

        //remove
        System.out.println("remove()");

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints true
        System.out.println(birds); // [hawk]

        //isEmpty()
        //size()
        System.out.println("isEmpty(), size()");

        birds.clear();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2


        //clear
        System.out.println("clear()");

        birds.clear();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
        birds.clear(); // []
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0

        //contains
        System.out.println("contains()");

        birds.clear();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false

    }
}
