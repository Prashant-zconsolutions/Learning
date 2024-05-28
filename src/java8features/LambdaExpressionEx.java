package java8features;

interface Drawable{

    void draw();
}

interface  Addition{
    int sum(int a,int b);
}
public class LambdaExpressionEx {

    public static void main(String args[])
    {

        // lambda expression without parameter
    Drawable d1 = () -> {
      System.out.println("Drawing");
    };
    d1.draw();


    // lambda expression with parameter and in one line
    Addition ad = (a,b)->(a+b);
    System.out.println(ad.sum(9,7));

    // lambda expression with parameter
    Addition ad2 = (a2,b2)->{
      return a2+b2;
    };
    System.out.println(ad2.sum(20,20));





    }
}
