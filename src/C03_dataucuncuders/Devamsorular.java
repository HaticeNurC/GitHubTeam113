package C03_dataucuncuders;

import java.util.Scanner;

public class Devamsorular {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println(" Lutfen Cemberin yaricapini giriniz");

        double yaricap= scan.nextDouble();

        System.out.println("Cemberin cevresi" + 2*3.14* yaricap);
        System.out.println("Dairenin alani"+3.14*yaricap* yaricap);

    }
}
