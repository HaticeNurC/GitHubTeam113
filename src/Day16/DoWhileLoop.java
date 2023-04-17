package Day16;

import java.util.Scanner;

public class DoWhileLoop {
    //Kullanicidan tplanmak uzere sayilar alin
    //kullaniciya bitirmek icin 0 a basmasini soyleyin kullanici 0 a bastiginda
    //0 haric kac sayiya girildigini ve toplamlarini yazdirin.
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int girilensayi = 1;
        int toplam = 0;
        int sayiadedi = 0;


       /* while (girilensayi != 0) {
            System.out.println("Toplanmak uzere tamsayilar giriniz" +
                    " \nBitirmek icin 0 a basiniz ");

            girilensayi = scan.nextInt();
            if (girilensayi != 0) {
                toplam += girilensayi;
                sayiadedi++;
            }
        } */

        do {
            System.out.println("Toplanmak uzere tamsayilar giriniz" +
                    " \nBitirmek icin 0 a basiniz ");

            girilensayi = scan.nextInt();
            if (girilensayi != 0) {
                toplam += girilensayi;
                sayiadedi++;
            }

            }
            while (girilensayi != 0) ;
            System.out.println("Girilen sayiadedi " + sayiadedi + " adet sayinin toplami " + toplam);



    }
}

