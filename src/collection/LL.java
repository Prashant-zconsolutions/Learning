package collection;

import java.util.LinkedList;

public class LL {

    public static void main(String args[])
    {
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        for(String s : al)
            System.out.println(s);

    }
}
