package chapter4.usingstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print); // monkey

        Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
        s2.distinct().forEach(System.out::print); // duckgoose

        Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
        s3.skip(5).limit(2).forEach(System.out::print); // 67

        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        s4.map(String::length).forEach(System.out::print); // 676

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);

        Stream<String> s5 = Stream.of("brown-", "bear-");
        s5.sorted().forEach(System.out::print); // bear-brown

        Stream<String> s6 = Stream.of("brown bear-", "grizzly-");
        s6.sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear-

        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s7 -> s7.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }

}
