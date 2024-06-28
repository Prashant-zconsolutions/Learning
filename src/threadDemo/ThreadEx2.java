package threadDemo;

public class ThreadEx2 extends Thread{

    private int s1 = 0;
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
//            s1 = i;
            System.out.println("i = "+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadEx2 ex2 = new ThreadEx2();
        Thread th1 = new Thread(ex2);
        Thread th2 = new Thread(ex2);
        th2.start();
        th1.start();
        th2.join();
        th1.join();

    }
}
