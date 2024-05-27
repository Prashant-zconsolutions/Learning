package string;

public class String1 {
    public static void main(String ars[])
    {
        /*
        String s="Sachin";
        System.out.println(s.toUpperCase());//SACHIN
        System.out.println(s.toLowerCase());//sachin
        System.out.println(s);//Sachin(no change in original)

         */

        String s2="Sachin";
        // check given string is start with Sa or not
        System.out.println(s2.startsWith("Sa"));//true
        // check given string is ends with n or not
        System.out.println(s2.endsWith("n"));//true
        // check which character is present in 1 index
        System.out.println(s2.charAt(1));
        // check string length
        System.out.println(s2.length());
        // check given string is present or not



        int a = 10;
        // valueOf method is used to convert any data type into String
        String st = String.valueOf(a);
        System.out.println(st);


        String s1="Java is a programming language. Java is a Platform Independent.";
        System.out.println(s1.contains("language"));
        String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"
        // replace method is used to replaces all occurrence of first sequence of character with second sequence of character.
        System.out.println(replaceString);

        String s4 = "Pooja is a Doctor";
        String st5 = s4.replaceFirst("Doctor","Software Engineer");
        System.out.println(st5);









    }
}
