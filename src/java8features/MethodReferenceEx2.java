package java8features;

interface Animal{
    void cat();
}

public class MethodReferenceEx2 {

    public void childCat()
    {
        System.out.println("Hello,this is non-static method");
    }
    public static void main(String[] args)
    {
        MethodReferenceEx2 methodReferenceEx2 = new MethodReferenceEx2();

        // Referring non-static method
        Animal an = methodReferenceEx2::childCat;
        // Calling interface method
        an.cat();
    }
}
