package Day15_WhileLoop;

import java.util.Scanner;

public class whileloop_rakamlartop {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif bir tamsayi girin");

        int girilensayi= scan.nextInt();
        int sayi=girilensayi;
        int birlerbasamagi=0;
        int rakamlartoplami=0;

        while (sayi>0){
            birlerbasamagi=sayi%10;
            rakamlartoplami+=birlerbasamagi;
            sayi/= 10;

        }
        System.out.println( girilensayi + "Rakamlar toplami : " + rakamlartoplami);
        System.out.println(rakamlartoplami_method.rakamlartoplaminibul(girilensayi));

    }
}
