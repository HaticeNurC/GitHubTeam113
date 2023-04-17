package C03_dataucuncuders;

import java.util.Scanner;

public class swap_interview {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Sayi1'i giriniz(Tamsayi)");


        int sayi1= scan.nextInt();
        System.out.println("Sayi2'yi giriniz(Tamsayi)");

        int sayi2= scan.nextInt();

        int temp=0;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println("Sayi1'nin yeni degeri"+sayi1);
        System.out.println("Sayi2'nin yeni degeri"+sayi2);




    }
}
