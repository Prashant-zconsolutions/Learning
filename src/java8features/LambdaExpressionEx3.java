package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionEx3 {

    public static void main(String[] args)
    {

        // Adding products
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Mac 14",120000f));
        list.add(new Product(2,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(4,"Dell Mouse",150f));

        /*
        // sorting products on the basis of name
        // implementing lambda expression
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
         */

        // lambda expression in one line
        Collections.sort(list,(p3,p4)-> p3.name.compareTo(p4.name));

        for(Product p : list)
            System.out.println(p.id+" "+p.name+" "+p.price);



    }
}
