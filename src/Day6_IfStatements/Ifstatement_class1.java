package Day6_IfStatements;

import java.util.Scanner;

public class Ifstatement_class1 {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        if (a % 2 == 0) ;
        {
            System.out.println("a b'den buyuktur");


        }

        boolean sonuc = b * 7 > a;
        if (sonuc) ;
        {
            System.out.println("sonuc dogrulanmistir");
        }

//bunu yeni bir sayfada deneyebilirsin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 5 == 0) ;
        {
            System.out.println("Sayi 5'in tam katidir.");
        }

        if (sayi % 3 == 0) ;
        {
            System.out.println("Sayi 3 un katidir");
        }
        if (sayi % 5 == 0) ;
        {
            System.out.println("Sayi 5 in tam katidir");
        }
    }
}