package Day25_ImmutableMutable;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time {
    public static void main(String[] args) {

        LocalDateTime saat=LocalDateTime.now();

        System.out.println(saat);

        LocalTime saat1=LocalTime.now();

        System.out.println(saat1);

        LocalTime saat2=LocalTime.of(20,15);
        System.out.println(saat2);

        System.out.println(saat2.getHour());

        System.out.println(saat2.plusHours(2).plusMinutes(50));

        System.out.println(saat2.minusMinutes(10).minusSeconds(5));

        System.out.println(saat.isAfter(saat));

        System.out.println(saat.isBefore(saat));

        System.out.println(saat1.toSecondOfDay());//gunun kacinci saniyesinde oldugunu veriyor
    }



}
