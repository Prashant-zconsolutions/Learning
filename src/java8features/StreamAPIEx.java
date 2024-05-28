package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product1{
    int id;
    String name;
    float price;
    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}


public class StreamAPIEx {

    public static void main(String[] args)
    {

        List<Product1> productsList = new ArrayList<Product1>();
        //Adding Products
        productsList.add(new Product1(1,"HP Laptop",25000f));
        productsList.add(new Product1(2,"Dell Laptop",30000f));
        productsList.add(new Product1(3,"Lenevo Laptop",28000f));
        productsList.add(new Product1(4,"Sony Laptop",28000f));
        productsList.add(new Product1(5,"Apple Laptop",90000f));

        List<String> productPricelist = productsList.stream().filter(p->p.price == 25000)
                .map(p->p.name).collect(Collectors.toList());

        System.out.println(productPricelist);

        // This is more compact approach for filtering data
//        productsList.stream().filter(p->p.price == 25000).forEach(p->System.out.println(p.name));


        // Convert list into Map
//        Map<Integer, Product1> productMap = productsList.stream()
//                .collect(Collectors.toMap(Product1::getId, p -> p));
//
//        productMap.forEach((id, product) -> System.out.println("ID: " + id + ", Product: " + product.getName()));


    }
}
