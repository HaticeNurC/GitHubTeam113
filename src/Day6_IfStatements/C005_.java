package Day6_IfStatements;

import java.util.Scanner;

public class C005_ {
    public static void main(String[] args) {

        //Kullanicidan yasini iste 65 yas ve uzeri ise ... yazdir, yoksa
        // emekli olmasi icin calismasi gereken yil sayisini yazdir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olabilmek icin daha" + (65 - yas) + "yil calismalisin");
        }
    }
}
