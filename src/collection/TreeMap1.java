package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String args[])
    {
        Map<Integer,String> map=new TreeMap<>();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");

        for(Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
}
