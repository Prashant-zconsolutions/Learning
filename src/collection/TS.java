package collection;

import java.util.TreeSet;

public class TS {

    public static void main(String args[])
    {
        // order sorted by-default
        // duplicates are not allowed
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Jugal");
        set.add("Prashant");

        for(String s : set)
            System.out.println(s);

    }
}
