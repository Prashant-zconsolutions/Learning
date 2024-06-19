package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ForEachMethodEx {

    public static void main(String[] args)
    {

        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");

        System.out.println("------------Iterating by passing lambda expression--------------");
        gamesList.forEach(x -> System.out.println(x));

        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.stream().forEachOrdered(System.out::println);


        System.out.println();

        Map<String, Integer> map = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        map.forEach((s, i) -> {
            System.out.println(s + ": " + i);
        });




    }
}
