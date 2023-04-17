package Day35_Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=5;

        System.out.println(sayi1/sayi2);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi3= 0;

        try {
            sayi3= scanner.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Tam sayi yazmaniz gerekir");

        }


        if (sayi3==0){
            System.out.println("Sifir giremezsin");
        }else {
            System.out.println(sayi1/sayi3);
        }


    }
}
