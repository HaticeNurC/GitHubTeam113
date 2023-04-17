package Day6_IfStatements;

import java.util.Scanner;

public class C006_Wrapperkrk {

    public static void main(String[] args) {

        //kullanicidan bir karakter iste
        //girilen karakter kucuk ise onu buyuk harf larak yazdir
        //yksa girilen karakteri yazdir

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char krk=scan.next().charAt(0);

        if ('a'<=krk && krk<='z'){
            System.out.println(Character.toUpperCase(krk));
        } else {
            System.out.println(krk);
        }
    }
}
