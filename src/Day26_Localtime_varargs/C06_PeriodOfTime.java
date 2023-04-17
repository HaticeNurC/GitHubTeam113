package Day26_Localtime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(1980, 2, 3);

        LocalDate bugun= LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));

        System.out.println("Yas : " + Period.between(dogumTarihi,bugun).getYears());
        System.out.println("Yas : " + Period.between(dogumTarihi,bugun).getMonths());
    }
}
