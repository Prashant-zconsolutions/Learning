package java8features;

interface sayable{
    void say(String msg);

}
public class FunctionalInterfaceEx implements sayable{
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args)
    {
        FunctionalInterfaceEx fi = new FunctionalInterfaceEx();
        fi.say("Hello there");
    }


}
