package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionListEx {

    public static void main(String[] args) {

        // In Java, a List<Function<ValueType, ReturnType>>
        // represents a list of functions where each function takes a parameter
        // of type ValueType and returns a value of type ReturnType.
        List<Function<Integer, String>> functions = new ArrayList<>();

        functions.add(i -> "Number: " + i);
        functions.add(i -> "Square: " + (i * i));
        functions.add(i -> "Double: " + (i * 2));

        Integer input = 5;

        for (Function<Integer, String> function : functions) {
            String result = function.apply(input);
            System.out.println(result);
        }


        // findFirst().orElse() method
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        List<String> emptyList = new ArrayList<>();

        String firstElement = list.stream().findFirst().orElse("empty");

        System.out.println(firstElement);


    }
}
