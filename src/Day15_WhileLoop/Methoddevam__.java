package Day15_WhileLoop;

public class Methoddevam__ {
    public static void main(String[] args) {

        asalmiYazdir(2);
        asalmiYazdir(3);
        asalmiYazdir(20);



    }

    public static void asalmiYazdir(int sayi) {
        int flag = 0;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag++;
                break;
            }
        }
            if (sayi == 2) {
                System.out.println("Girilen 2 sayisi asal sayidir");
            } else if (flag == 0) {
                System.out.println("Girilen sayi asal sayidir");

            } else {
                System.out.println("Girilen sayi asal bir sayi degildir.");
            }

        }


    }


