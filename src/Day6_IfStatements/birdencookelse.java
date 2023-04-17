package Day6_IfStatements;

import java.util.Scanner;

public class birdencookelse {
    public static void main(String[] args) {
        //Kullanicidan bir karaketer girmesini isteyin ,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char krk = scan.next().charAt(0);

        if ('A'<= krk && krk <='Z'){
            System.out.println("Girilen karakter buyuk harf");
    }  else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

    }
}
