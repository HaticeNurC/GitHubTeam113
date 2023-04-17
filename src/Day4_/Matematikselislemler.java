package Day4_;

import java.util.Scanner;

public class Matematikselislemler {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir sayi giriniz");

        int girilenSayi= scan.nextInt(); //135

        int rakam=girilenSayi %10 ; //5

        int rakamlartoplami=rakam;

       girilenSayi=girilenSayi /10;

        rakam=girilenSayi %10;

        rakamlartoplami=rakamlartoplami+ rakam ;



        girilenSayi=girilenSayi /10;

        rakam=girilenSayi %10;

        rakamlartoplami=rakamlartoplami+ rakam ;

        System.out.println("Girilen sayinin rakamlar toplami"+ rakamlartoplami);









    }
}
