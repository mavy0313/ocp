package chapter7.forkjoinframework;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class RecursiveActionTest {
    public static void main(String[] args) {
        Double[] weights = new Double[10];
        ForkJoinTask<?> task = new WeighAnimalAction(weights,0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
// Print results
        System.out.println();
        System.out.print("Weights: ");
        Arrays.stream(weights).forEach(d -> System.out.print(d.intValue()+" "));
    }
}
