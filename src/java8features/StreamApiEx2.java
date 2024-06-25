package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx2 {

    public static void main(String[] args) {

        // map
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        List<Integer> square = number.stream()
                .map(x-> x*x)
                .collect(Collectors.toList());

        System.out.println("Square : ");
        square.forEach(n-> System.out.print(n+","));

        // filter
        List<String> names = Arrays.asList("MS Dhoni","Rohit","Virat","Hardik","vishal");
        List<String> result = names.stream().filter(n->n.startsWith("v") || n.startsWith("V")).collect(Collectors.toList());

        System.out.println("\n\nfilter name from the first letter");
        result.forEach(n-> System.out.println(n));

        // sorted
        System.out.println("\nSorted string :");
        List<String> sortedString = names.stream().sorted().collect(Collectors.toList());
        sortedString.forEach(n-> System.out.println(n));


    }
}
