package chapter4.usingstreams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3

        Stream<String> s3 = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s3.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape

        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s4.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp

        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite2.anyMatch(pred)); // true

        Stream<String> s5 = Stream.of("Monkey", "Gorilla", "Bonobo");
        s5.forEach(System.out::print); // MonkeyGorillaBonobo

        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String s6: array) result = result + s6;
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s7, c) -> s7 + c);
        System.out.println(word); // wolf

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", String::concat);
        System.out.println(word2); // wolf

        Stream<Integer> stream3 = Stream.of(3, 5, 6);
        System.out.println(stream3.reduce(1, (a, b) -> a*b));

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::print); // no output
        oneElement.reduce(op).ifPresent(System.out::print); // 3
        threeElements.reduce(op).ifPresent(System.out::print); // 90

        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        StringBuilder word3 = stream4.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);

        Stream<String> stream5 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream5.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]

        Stream<String> stream6 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = stream6.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]
//        If we didn’t need the set to be sorted, we could make the code even shorter:
        Stream<String> stream7 = Stream.of("w", "o", "l", "f");
        Set<String> set3 = stream7.collect(Collectors.toSet());
        System.out.println(set3); // [f, w, l, o]
    }
}
