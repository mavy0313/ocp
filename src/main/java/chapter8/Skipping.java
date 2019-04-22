package chapter8;

import java.io.*;

public class Skipping {
    public static void main(String[] args) {
        try (InputStream is = new BufferedInputStream(new FileInputStream("tigers.txt"))) {
            System.out.print ((char)is.read());
            is.skip(2);
            is.read();
            System.out.print((char)is.read());
            System.out.print((char)is.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    The code will read one character, T, skip two characters, IG, and then read three more
//    characters, ERS, only the last two of which are printed to the user, which results in the
//    following output.
//    TRS
}
