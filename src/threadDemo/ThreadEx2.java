package threadDemo;

public class ThreadEx2 extends Thread{

    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("i = "+i);
        }
    }

    public static void main(String[] args) {

            ThreadEx2 t1 = new ThreadEx2();
            t1.start();
    }
}
