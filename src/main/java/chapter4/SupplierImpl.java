package chapter4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierImpl {

    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> str1 = StringBuilder::new;
        Supplier<StringBuilder> str2 = () -> new StringBuilder();
        System.out.println(str1.get());
        System.out.println(str2.get());

        Supplier<ArrayList<String>> suppl1 = ArrayList<String>::new;
        ArrayList<String> a1 = suppl1.get();
        System.out.println(a1);
    }
}
