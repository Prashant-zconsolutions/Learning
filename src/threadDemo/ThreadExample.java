package threadDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ThreadExample {
    public List<Integer> a1 = new ArrayList<>();



    public void addvalue(int value) {
        a1.add(value);
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadExample t = new ThreadExample();


        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                t.addvalue(i);
            }
        });
        Thread t2 = new Thread() {
            public void run() {

                for (int i = 1001; i < 2000; i++) {
                    t.addvalue(i);
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(t.a1.size());
    }

}