package Day8;

import java.util.Scanner;

public class interviewsoru {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir yil giriniz");

        int yil= scan.nextInt();

        if (yil %4!=0  ){
            System.out.println("Yil artik yil degildir.");
        } else if (yil %100 != 0 ) {
            System.out.println("Yil artik yildir");

        } else if (yil %400 ==0) {
            System.out.println("Artik yildir");
            
        } else {
            System.out.println("Artik yil degildir");
        }

    }
}
