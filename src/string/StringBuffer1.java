package string;

public class StringBuffer1 {

    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();

        // append is used to append specific string with this string
        sb.append("Java is a programming language.");
        System.out.println(sb);

        // insert() is used to insert string in specific index
        sb.insert(5,"and c ");
        System.out.println(sb);

        // delete is used to delete the string from specified startIndex and endIndex.
        sb.delete(4,sb.length());

        // substring specific string (Note : Substring method is temp modify the string.)
        System.out.println(sb.substring(2));

        // reverse is used to reverse string
        StringBuffer sb2 = sb;
        sb2.reverse();
        System.out.println(sb2);


    }

}
