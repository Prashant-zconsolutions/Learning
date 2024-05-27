package opps;

class Animal3{
    Animal3(){System.out.println("A new animal is created !");}
}
class Dog3 extends Animal3{
    Dog3(){
        super();
        System.out.println("A new dog is created !");
    }
}
public class SuperClassDemo {

    public static void main(String s[])
    {

    Dog3 d = new Dog3();

    }

}
