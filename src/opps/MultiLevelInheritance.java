package opps;

class Animal1 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog1 {
    void weep() {
        System.out.println("weeping...");
    }
}

public class MultiLevelInheritance{

    public static void main(String args[])
    {

        // create BabyDog Object it is a child class which inherit properties of dog1 class
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }


}
