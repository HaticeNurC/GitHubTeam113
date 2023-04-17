package Day6_IfStatements;

import java.util.Scanner;

public class C003_ifstatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if (not >= 50 && not <= 100); {
            System.out.println("Sinifi Gectin");
        }

        if (not < 50); {
            System.out.println("Maalesef kaldin");
        }
    }
}
