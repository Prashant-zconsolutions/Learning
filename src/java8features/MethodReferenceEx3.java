package java8features;

interface Messageable{
    Message getMessage(String msg);
}

class Message{
    Message(String msg)
    {
        System.out.println(msg);
    }
}
public class MethodReferenceEx3 {


    public static void main(String[] args)
    {

        Messageable hello = Message::new;
        hello.getMessage("Hello, Refer a constructor by using the new keyword");
    }
}
