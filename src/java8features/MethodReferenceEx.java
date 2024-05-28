package java8features;

interface Sayable{
    void say();
}
public class MethodReferenceEx {

    public static void saySomething()
    {
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args)
    {
        // Referring static method
        Sayable sayable = MethodReferenceEx::saySomething;
        // Calling interface method
        sayable.say();

    }
}
