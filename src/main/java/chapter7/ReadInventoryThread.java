package chapter7;

public class ReadInventoryThread extends Thread {
    @Override
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}
