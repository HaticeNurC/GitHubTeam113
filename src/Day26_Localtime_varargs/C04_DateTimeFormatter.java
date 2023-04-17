package Day26_Localtime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();

        System.out.println(ldt);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("d / MMM / yyyy");
        System.out.println(ldt.format(dtf));

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println(ldt.format(dtf2));

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("EEEE HH: mm");
        System.out.println(ldt.format(dtf3));

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("EEEE hh:mm a");
        System.out.println(ldt.format(dtf4));
    }
}
