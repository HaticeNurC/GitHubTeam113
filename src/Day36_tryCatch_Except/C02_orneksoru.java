package Day36_tryCatch_Except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_orneksoru {
    public static void main(String[] args) {
        //kullanicidan tam sayilar alin ve toplayin
        //kullanicidan bitirmesi icin q veya Q ya basmasini isteyin eger baska
        //bir sey yazarsa hata mesaji verip yeni deger isteyin


        int sayac=0;
        int toplam=0;
        int girilensayi=0;
        Scanner scan= new Scanner(System.in);

        do {
            System.out.println("toplanmak uzere tamsayilar giriniz");

            try {
                girilensayi=scan.nextInt(); //q veya Q disinda bir input girerse except.olur
                toplam +=girilensayi;
                sayac++;
            } catch (InputMismatchException e) {

                char input= scan.next().charAt(0); //?

                if (input=='q' || input=='Q'){

                    System.out.println("girilen" + sayac + "adet tamsayinin toplami :" + toplam);
                    break; //break yazmazsak islemi sonsuza kadar devam eder
                }else {
                    System.out.println("Tam sayi degeri girmelisiniz");
                }
            }

        }while (true);
        System.out.println("isleminiz bitmistir");
    }
}
