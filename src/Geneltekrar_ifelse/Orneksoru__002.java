package Geneltekrar_ifelse;

import java.util.Scanner;

public class Orneksoru__002 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen yasinizi ve cinsiyetinizi giriniz.");

        double yas= scan.nextDouble();

        System.out.println("Lufen cinsiyetinizi giriniz..." +
                "/nKadin icin: K, Erkek icin : E giriniz.");

        char cinsiyet= scan.next().charAt(0);

        if ((cinsiyet== 'K' && yas>=60) || (cinsiyet== 'E' && yas>=65)){
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K') {
            System.out.println("Emekli olabilmek icin"+ (60-yas)+ "yil daha calismalisin");

        } else if (cinsiyet=='E') {
            System.out.println(("Emekli olabilmek icin"+ (65-yas)+ "yil daha calismalisin"));

        }

    }
}
