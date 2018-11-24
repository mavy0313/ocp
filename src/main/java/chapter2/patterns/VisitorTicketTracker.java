package chapter2.patterns;

public class VisitorTicketTracker {
//    private static VisitorTicketTracker instance;
    private static volatile VisitorTicketTracker instance;
    private VisitorTicketTracker() {
    }
//    public static VisitorTicketTracker getInstance() {
//        if (instance == null) {
//            instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
//        }
//        return instance;
//    }


//    public static synchronized VisitorTicketTracker getInstance() {
//        if (instance == null) {
//            instance = new VisitorTicketTracker();
//        }
//        return instance;
//    }

    public static VisitorTicketTracker getInstance() {
        if (instance == null) {
            synchronized(VisitorTicketTracker.class) {
                if (instance == null) {
                    instance = new VisitorTicketTracker();
                }
            }
        }
        return instance;
    }
    // Data access methods
}
