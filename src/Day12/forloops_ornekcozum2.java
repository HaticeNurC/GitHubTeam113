package Day12;

import java.util.Scanner;

public class forloops_ornekcozum2 {
    public static void main(String[] args) {

        //bironceki soruya ek olarak bitis degeri baslangic degerinden kucuk olsa da
        //programi calistirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic icin bir tamsayi yazdirin");
        int bas = scan.nextInt();

        System.out.println("Lutfen bitis icin bir tamsayi yazdirin");
        int bit = scan.nextInt();
        int sayilartoplami = 0;

        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                sayilartoplami += i;

            }
        } else {
            for (int i = bas; i >= bit; i--) {
                sayilartoplami += i;

            }
        }

        System.out.println("Sayilarin toplami:" + sayilartoplami);
    }
}


