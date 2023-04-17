package C03_dataucuncuders;

import java.util.Scanner;

public class Scannerolusturma_003 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        double yas= scan.nextDouble();

        System.out.println("/nIsminiz:"+ isim+
                "/nSoyisminiz:"+ soyisim +
                "/nYasiniz:"+ yas +
                "Kaydiniz basariyla tamamlanmistir");

    }
}
