package threadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

    public static void main(String[] args) {

        // new Fixed Thread Pool
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for (int i = 1; i <= 10; i++) {
//            executorService.execute(new Task(i));
//        }
//        executorService.shutdown();

        // new Cached Thread Pool
//        ExecutorService ex = Executors.newCachedThreadPool();
//        for (int i =1; i <=6 ; i++) {
//            ex.execute(new Task(i));
//        }
//        ex.shutdown();



        // new Scheduled Thread Pool
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
        ex.scheduleAtFixedRate(new Task(8),0,3, TimeUnit.SECONDS);


    }
}

class Task implements Runnable{

    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task "+taskId+" is running on thread: "+Thread.currentThread().getName());
    }
}
