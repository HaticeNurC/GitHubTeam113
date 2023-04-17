package Day19_MultiDimensionalArray;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        String str="Java candir can, bundan suphesi olan var mi";
        //str kac kelimediri soyle yapariz
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        System.out.println("kelime sayisi: " + kelimeler.length );

        // en uzun kelime kac harflidir?

        int enUzunKelimeLength= kelimeler[0].length();

        for (int i = 0; i <kelimeler.length ; i++) {

            if (kelimeler[i].length()> enUzunKelimeLength){
                enUzunKelimeLength=kelimeler[i].length();


            }

        }
        System.out.println("En uzun kelimenin karakter sayisi: "+ enUzunKelimeLength);
        //Bir stringi karakterlerine ayirmak istersek

        String[] karakterler=str.split("");

        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi: " + karakterler.length);
    }
}
