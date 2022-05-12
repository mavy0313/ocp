package chapter3.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> elephantCrate = new Crate<>();
        elephantCrate.packCrate(elephant);
        Elephant elephantFromCrate = elephantCrate.emptyCrate();

        ship("Type");

        List<? super String> strings = new ArrayList<Object>();
//        strings.add("1");
//        strings.add(new Object());

//        List<? super IOException> exceptions = new ArrayList<Exception>();
        List<? super IOException> exceptions = new ArrayList<Exception>();
//        exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
}
