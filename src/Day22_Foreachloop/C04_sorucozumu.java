package Day22_Foreachloop;

import java.util.Arrays;
import java.util.Scanner;

public class C04_sorucozumu {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir harf alin,
        //harf cumlede kullanilmamissa kac kere kullanildigini yazdirin
        //kullanilmadiysa "harf cumlede kullanilmamistir" yazdirin


        String girilencumle= "Yatin kalkin Java Calisin";
        String istenenharf= "a";

        //cumleyi harflerine bolmek icin split methodu kullanilir

        String[] karakterler= girilencumle.split("");

        System.out.println(Arrays.toString(karakterler));

        int sayac=0;

        for (String each: karakterler
             ) {
            if (each.equalsIgnoreCase(istenenharf)){
                sayac++;

            }
        }
        if (sayac==0){
            System.out.println("Girilen harf cumlede kullanilmamistir");
        }else {
            System.out.println("Istenen harf "+ sayac + " adet kullanilmis");
        }






    }
}
