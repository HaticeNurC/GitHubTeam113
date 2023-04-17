package Day6_IfStatements;

import java.util.Scanner;

public class C004_ifelse {
    public
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu girin");
        double not = scan.nextDouble();

        if (not >= 50 && not <= 100) {
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }
    }
}
