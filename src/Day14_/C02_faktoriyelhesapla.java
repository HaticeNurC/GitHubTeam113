package Day14_;

import java.util.Scanner;

public class C02_faktoriyelhesapla {
    public static void main(String[] args) {

        int sonuc= faktoriyelhesapla(5);
        System.out.println(sonuc);

    }

    public static int faktoriyelhesapla(int sayi1){

        int faktoriyel=1;
        for (int i = sayi1; i >=1 ; i--) {
            faktoriyel *=i;

        }
        return faktoriyel;
    }


}
