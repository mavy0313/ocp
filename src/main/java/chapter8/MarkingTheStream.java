package chapter8;

import java.io.*;

public class MarkingTheStream {
    public static void main(String[] args) {
        try (InputStream is = new BufferedInputStream(new FileInputStream("abcd.txt"))) {
            System.out.print((char) is.read());
            if (is.markSupported()) {
                is.mark(100);
                System.out.print((char) is.read());
                System.out.print((char) is.read());
                is.reset();
            }
            System.out.print((char) is.read());
            System.out.print((char) is.read());
            System.out.print((char) is.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //output: ABCBCD
//        It first outputs A before the if/then statement. Since we are given that the stream supports
//        the mark() operation, it will enter the if/then statement and read two characters, BC.
//        It then calls the reset() operation, moving our stream back to the state that it was in after
//        the A was read, therefore BC are read again, followed by D.
    }
}
