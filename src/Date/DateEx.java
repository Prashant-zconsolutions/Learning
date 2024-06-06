package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {

    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        date = date.minusDays(5);
        System.out.println(date);


        LocalDate d2 = LocalDate.of(2027,1,13);
        System.out.println(d2.isLeapYear());

        LocalDate d3 = LocalDate.of(2024,1,13);
        System.out.println(d3.isLeapYear());

        LocalDate d4 = LocalDate.now();
        // set time
        LocalDateTime dateTime = d4.atTime(1,55,6);
        System.out.println(dateTime);


        // convert date into string
        LocalDate d5 = LocalDate.now();
        String d1Str = d5.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date in string :  " + d1Str);

        // String to Date
        String d = "2023-04-09";
        LocalDate d6 = LocalDate.parse(d);
        System.out.println(d6);



    }
}
