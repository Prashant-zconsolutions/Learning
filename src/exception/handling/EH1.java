package exception.handling;

public class EH1 {

    public static void main(String args[]) {


        try {
            //code that may raise exception
            int arr[] = new int[5];
            arr[5] = 100 / 0;
            String s=null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest of the code...");

        
    }
}
