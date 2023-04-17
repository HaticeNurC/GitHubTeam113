package Day14_;

import java.util.Scanner;

public class methodlusturma {
    public static void main(String[] args) {

        ikisayitopla();



    }

    public static void ikisayitopla() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Toplanmak uzere iki sayi giriniz.");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("iki sayinin toplami : " + (sayi1+sayi2) );
        }
    }


