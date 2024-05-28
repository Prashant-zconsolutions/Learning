package java8features;

import java.util.ArrayList;
import java.util.List;
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

    }
}
