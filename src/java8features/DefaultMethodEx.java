package java8features;

interface Sayable2{

    // Default method
    default void say()
    {
        System.out.println("Hello, this is default method");
    }

    // abstract method
    void sayMore(String msg);
}
public class DefaultMethodEx implements Sayable2 {

    @Override
    public void sayMore(String msg) {
    System.out.println(msg);
    }

    public static void main(String[] args)
    {
        DefaultMethodEx df = new DefaultMethodEx();
        df.say();
        df.sayMore("this is abstract method");
    }


}
