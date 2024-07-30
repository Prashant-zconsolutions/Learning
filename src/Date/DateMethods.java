package Date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateMethods {

    public static void main(String[] args) {


        LocalDate dt1 = LocalDate.parse("2024-01-04");
        LocalDate dt2 = LocalDate.parse("2023-01-04");

        System.out.println(dt1.isAfter(dt2));

        LocalDate date =  dt2.plusMonths(6); // add six months in date
        System.out.println(date);

        LocalDate date2 = dt1.withDayOfMonth(1);
//        LocalDate date2 = dt1.withMonth(12);
        System.out.println(date2);

        System.out.println("-----------------Day of Month------------------");
        System.out.println(date.withDayOfMonth(1)+"\n"+date2.withDayOfMonth(1));

        long between = ChronoUnit.MONTHS.between(date.withDayOfMonth(1), date2.withDayOfMonth(1));
        System.out.println("Number of months between two date is -> "+between);


    }
}
