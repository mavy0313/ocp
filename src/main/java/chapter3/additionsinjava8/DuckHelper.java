package chapter3.additionsinjava8;

import chapter3.comparable.Duck;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DuckHelper {
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeightlambdaWithParams = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);

        Comparator<Duck> byWeight = DuckHelper::compareByWeight;

        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList();

        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        list2.replaceAll(x -> x*2);
        System.out.println(list2); // [2, 4, 6]

        List<String> cats = Arrays.asList("Annie", "Ripley");
        for(String cat: cats)
            System.out.println(cat);

        cats.forEach(c -> System.out.println(c));
        cats.forEach(System.out::println);
    }
}
