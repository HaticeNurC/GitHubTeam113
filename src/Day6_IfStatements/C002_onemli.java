package Day6_IfStatements;

import java.util.Scanner;

public class C002_onemli {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin uc kenar uzunlugunu alin ,ucgen eskenar ise
        // eskenar ucgen yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Ucgenin uc kenar uzunlugunuz giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3) ;
        {
            System.out.println("Eskenar ucgen");
        }

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz notu yazin");

        double not = scan1.nextDouble();

        if (not >= 50 && not<=100);{
            System.out.println("Dersi gectiniz");
        }

        if (not < 50);{
            System.out.println("Maalesef dersten kaldin");

        }
    }
}
//kod calismadi tekrar kontorl et

