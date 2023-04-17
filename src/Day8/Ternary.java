package Day8;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        //kullanicidan pzitif bir tamsayi alin
        //cift sayi ise cift tekse tek yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pzitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi %2==0 ? "cift sayidir" : "tek sayidir");
        // basit karsilastirmalarda bu yontemi kullanabilirsin

        Scanner scan1= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int tamsayi= scan1.nextInt();

        if (tamsayi>=0){
            System.out.println(sayi);
        }else {
            tamsayi=tamsayi * (-1);
            System.out.println(tamsayi);
        }

        // ternary sekli
        tamsayi = tamsayi>=0 ? tamsayi : tamsayi*(-1);
        System.out.println(tamsayi);

        System.out.println(tamsayi >= 0 ? "tamsayi" : "tamsayi *(-1)");
        // ya da
        String sonuc= tamsayi >= 0 ? "tamsayi" : "tamsayi *(-1)";
        //yazabilirsin ancak rakam ve harfin ayni yerde oldugu bir kodda kullanilmaz.

    }

}
