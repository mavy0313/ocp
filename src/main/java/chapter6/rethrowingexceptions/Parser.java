package chapter6.rethrowingexceptions;

import java.io.IOException;
import java.time.format.DateTimeParseException;

public class Parser {
    public void parseData() throws IOException, DateTimeParseException {}

    public static void main(String[] args) {
        try {
            System.out.println();
            throw new IOException();
        } catch (IOException e) {
            System.out.println("io catch");
        } catch (Exception e) {
            System.out.println("e catch");
        }
    }
}
