package Tim;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class challenge {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate birthday = LocalDate.of(1985, 8, 8);
        System.out.println(birthday);
        LocalDateTime tom = LocalDateTime.now();
        System.out.println(tom);

        boolean b = birthday.isBefore(now);
        System.out.println(b);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yy");
        System.out.println(dtf.format(now));
        System.out.println(dtf.format(birthday));



        double d1 = 20.0;
        double d2 = 80.0;
        double result = (d1 + d2)*100;
        System.out.println(result);

        double remainder = result % 30;
        System.out.println(remainder);

        boolean b1 = (remainder == 0) ? true : false;
        System.out.println(b1);

        if (!b1) {
            System.out.println("Got some remiander");
            System.out.println("hello");


        }

    }
}
