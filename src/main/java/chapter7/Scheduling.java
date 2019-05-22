package chapter7;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduling {

  public static void main(String[] args) {
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    Runnable task1 = () -> System.out.println("task1 " + LocalTime.now());
    Callable<String> task2 = () -> "Monkey";
    Runnable task3 = () -> {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("task3 " + LocalTime.now());
    };
    Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
    Future<?> result2 = service.schedule(task2, 5, TimeUnit.SECONDS);

    service.scheduleAtFixedRate(task1,5,3, TimeUnit.SECONDS);//executes task and doesnt wait for finishing previous
    service.scheduleWithFixedDelay(task3, 5, 3, TimeUnit.SECONDS); // waits for finishing previous task
  }
}
