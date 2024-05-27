package exception.handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EH5 {


    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("D:\\Resource\\test.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();

    }
    public static void main(String args[])
    {
        // Throwing Checked Exception

        try
        {
            method();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");

    }

}
