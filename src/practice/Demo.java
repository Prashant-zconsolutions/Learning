package practice;

public class Demo {

    public static void main(String[] args) {


//        String a = "stack";
//        String b= "stack";
//        String c = "heap";
//        String d = new String("stack");

        Integer a = 12;
        Integer b= 12;
        Integer c = 43;
        Integer d = 12;





        System.out.println("Hash code of a : "+a.hashCode());
        System.out.println("Hash code of b : "+b.hashCode());
        System.out.println("Hash code of c : "+c.hashCode());
        System.out.println("Hash code of c : "+d.hashCode());

        System.out.println((a==d)+" :: "+a.equals(d)); // == compare address and equals() compare content

        System.out.println("Identify code of a : "+System.identityHashCode(a));
        System.out.println("Identify code of b : "+System.identityHashCode(b));
        System.out.println("Identify code of c : "+System.identityHashCode(c));
        System.out.println("Identify code of d : "+System.identityHashCode(d)); // address is different because of creating new obj


    }

}
