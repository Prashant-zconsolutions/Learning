package Date;

import java.time.LocalDate;

public class DateEx2 {

    public static void main(String[] args) {


        LocalDate date = LocalDate.parse("2023-05-01");

        String month = date.getMonth().toString();

        System.out.println(month);

        int year = date.getYear();
        System.out.println(year);

    }
}
