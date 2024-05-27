package collection;

import java.util.Vector;

public class Vector1 {
    public static void main(String args[])
    {
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");

        for(String s : v)
            System.out.println(s);

    }

}
