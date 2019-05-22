package chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaitingForAllTasksToFinish {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            // Add tasks to the thread executor
            service.submit(() -> 30 + 20);
            service.submit(() -> 30 + 30);
            service.submit(() -> 30 + 40);
//            service.submit(() -> {
//                Thread.sleep(5000);
//                return null;
//            });
        } finally {
            if(service != null) service.shutdown();
        }
        if(service != null) {
//            service.awaitTermination(1, TimeUnit.SECONDS);
            service.awaitTermination(1, TimeUnit.MINUTES);
            // Check whether all tasks are finished
            if(service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }
}
