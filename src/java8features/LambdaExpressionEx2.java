package java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExpressionEx2 {

    public static void main(String args[])
    {
        List<String> list=new ArrayList<>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(n->System.out.println(n));



    }
}
