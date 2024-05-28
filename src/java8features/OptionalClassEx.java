package java8features;

import java.util.Optional;

public class OptionalClassEx {

    public static void main(String[] args)
    {
        /*
        // without using optional class, program terminates abnormally and throws a nullPointerException.
        String[] str = new String[10];
        String lowercaseString = str[5].toLowerCase();
        System.out.print(lowercaseString);

         */


        /* with using Optional Class
        // To avoid the abnormal termination, we use Optional class.
         In the following example, we are using Optional. So, our program can execute without crashing. */
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }
}
