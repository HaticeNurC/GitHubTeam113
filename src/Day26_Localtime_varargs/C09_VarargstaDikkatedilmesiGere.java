package Day26_Localtime_varargs;

import java.util.Arrays;

public class C09_VarargstaDikkatedilmesiGere {
    public static void main(String[] args) {
        //verilen sayilardan ilki haric digerlerini toplasin
        //sonra toplam ile ilk saiyiyi carpip yazdirsin

        topla(2, 3, 4, 5, 6);


    }

    /*

    public static void topla(int... a) {
        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each : a
        ) {
            toplam += each;

        }
        System.out.println("Toplam : " + toplam);

     }
    */
    public static void topla(int c, int... a) {
        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each : a
        ) {
            toplam += each;

        }
        System.out.println("Istenen Toplam : " + toplam*c);
    }
}
