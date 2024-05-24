package control.statement;

public class ForLoopEx {

    public static void main(String args[])
    {

        /*
        Simple For loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
         */

        /*
        Nested For loop
        for(int i=0 ;i<=5;i++)
        {
            for(int j=0 ;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

         */


        /*
        for each loop

        String[] daysArr = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        // fetch dayArr one by one
        for(String day : daysArr)
            System.out.println(day);

         */


        /*
//        Labeled For loop

        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }

         */




        /*
//        for loop using break statement
        for(int i=1;i<=10;i++){
            if(i==5){
                //breaking the loop
                break;
            }
            System.out.println(i);
    }

         */


        /*
//        for loop using continue statement
        for(int i=1;i<=10;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }

         */




    }
}
