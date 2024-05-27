package collection;

import java.util.ArrayList;

public class AL {

    public static void main(String args[])
    {
        //Creating arraylist
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        for(String s : list)
            System.out.println(s);
    }
}
