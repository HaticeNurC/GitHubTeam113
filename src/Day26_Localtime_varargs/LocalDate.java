package Day26_Localtime_varargs;

public class LocalDate {

    public static void main(String[] args) {

        java.time.LocalDate tarih= java.time.LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.isLeapYear());

        System.out.println(tarih.plusWeeks(20).plusDays(13));

        System.out.println(tarih.minusMonths(3).minusDays(25));

        System.out.println(tarih.withYear(1945).withMonth(5));

        System.out.println(tarih.getDayOfYear());

        System.out.println(tarih.getMonth());

        System.out.println(tarih.getMonthValue());

        System.out.println(tarih.getDayOfWeek());
    }
}
