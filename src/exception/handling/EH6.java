package exception.handling;

public class EH6 {

    public static void main(String[] args) {

        // Throwing User-defined Exception
        try
        {
            throw new CustomException("This is a custom exception. >> ");

        } catch (CustomException e)
        {
            System.out.println("test 1");
            System.out.println(e.getMessage());
        }
    }
}
