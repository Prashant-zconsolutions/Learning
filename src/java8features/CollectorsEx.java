package java8features;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product3{
    int id;
    String name;
    float price;

    public Product3(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class CollectorsEx {

    public static void main(String[] args)
    {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList =
                productsList.stream()
                        .map(x->x.price)         // fetching price
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);

        // sumof all product list price
//        Double d = productsList.stream().collect(Collectors.summingDouble(x->x.price));
//        System.out.println(d);


    }
}
