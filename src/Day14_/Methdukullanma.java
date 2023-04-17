package Day14_;

import java.util.Scanner;

public class Methdukullanma {
    public static void main(String[] args) {
        //kullanicidan 10 dan kucuk iki tamsayi al
        //faktoriyel degerlerini hesapla ve topla

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10 dan kucuk iki tamsayi yazin");
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        int sonuc= C02_faktoriyelhesapla.faktoriyelhesapla(sayi2) +
                C02_faktoriyelhesapla.faktoriyelhesapla(sayi3);
        System.out.println(sonuc);

    }
}
