package Day13_;

public class Nestedforloop {
    public static void main(String[] args) {
        //dinamik olarak verilen satir ve sutun sayisina
        // gore yildizlardan bir dikdortgen olusturun.

        int satirsayisi=3;
        int sutunsayisi=5;

            for (int k = 1 ; k <= satirsayisi; k++) { //satirsayisi

                for (int i = 1; i <= sutunsayisi; i++) { //sutunsayisi
                    System.out.print("* ");

                }
                System.out.println(" ");//bir satirdatki tum sutunlar bitince
                //bir alt satira gecmesi icin
        }
        System.out.println("=======");

             int sayi=4;

        for (int j = 1; j <=sayi ; j++) {
            for (int i = 1; i <=sayi ; i++) {
                System.out.print(j*i + " ");

            }
            System.out.println(" ");

        }
        int satir1=5;

        for (int m = 1; m <=satir1 ; m++) {

            for (int n = 1; n <=m ; n++) {
                System.out.print(n + " ");

            }
            System.out.println("");

        }
    }
}
