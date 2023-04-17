package Day22_Foreachloop;

public class C01_Eachloop {

    public static void main(String[] args) {

        int [] arr={3,5,6,7,8,2,3,6,9,9,6,2};

        //arr nin tum elemanlarinin toplamini yazdirin

        int toplam=0;

        for (int each: arr
             ) {
            toplam+=each;

        }
        System.out.println("Elemanlar toplami " + toplam);

        //arr nin elemanlarindan 3 ile bolunebilenleri yazdirin
        for (int each: arr
             ) {
            if (each %3==0) System.out.print(each+ " ");

        }
        System.out.println("");

        //arr in elementleri icinde kac tane tek sayi oldugunu bulun
        int sayac=0;

        for (int each: arr
             ) {
            if (each%2 !=0) sayac++;
        } System.out.print(sayac + " ");


    }
}
