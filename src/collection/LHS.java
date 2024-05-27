package collection;

import java.util.LinkedHashSet;

public class LHS {

    public static void main(String args[])
    {
        // order is maintain
        // duplicates are not allowed
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Jugal");
        set.add("Prashant");

        for(String s : set)
            System.out.println(s);
    }
}
