package string;

public class StringBuilder1 {

    public static void main(String args[])
    {


        // The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized
        StringBuilder sb = new StringBuilder();

        // append is used to append specific string with this string
        sb.append("Java is a programming language.");
        System.out.println(sb);

        // insert() is used to insert string in specific index
        sb.insert(5,"and c ");
        System.out.println(sb);

    }
}
