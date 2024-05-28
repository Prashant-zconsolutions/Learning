package collection;

import java.util.HashSet;

public class HS {

    public static void main(String args[])
    {
        // order is not maintain
        // duplicates are not allowed
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Jugal");
        set.add("Prashant");

        for(String s : set)
            System.out.println(s);

    }
}
