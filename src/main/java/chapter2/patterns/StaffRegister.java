package chapter2.patterns;

public class StaffRegister {
    private static final StaffRegister instance;
    static {
        instance = new StaffRegister();
// Perform additional steps
    }
    private StaffRegister() {
    }

    public static StaffRegister getInstance() {
        return instance;
    }
}
