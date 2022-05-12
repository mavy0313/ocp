package chapter7.forkjoinframework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class RecursiveTaskTest {
    public static void main(String[] args) {
        Double[] weights = new Double[10];
        ForkJoinTask<Double> task = new WeighAnimalTask(weights,0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        Double sum = pool.invoke(task);
        System.out.println("Sum: "+sum);
    }
}
