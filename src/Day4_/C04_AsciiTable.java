package Day4_;

import java.util.Scanner;

public class C04_AsciiTable {
    public static void main(String[] args) {

        char girilenChar= 'f';
        System.out.println((char) (girilenChar+1));

        girilenChar='M';
        System.out.println((char) (girilenChar-2));

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir baska bir harf yziniz");

        char baskabirharf=scan.next().charAt(0);

        System.out.println("Baskabirharf" + baskabirharf +
                "/nBaskabirharften sonraki ilk 3 harf: " +
                (char) (baskabirharf+1) + ", "+
                (char)(baskabirharf+2)+ ", "+
                (char)(baskabirharf+3)+", ") ;

    }
}
