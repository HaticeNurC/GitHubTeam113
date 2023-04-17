package Day25_ImmutableMutable;

import java.util.ArrayList;
import java.util.List;

public class Java_PsbyValue {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);

        yeniListeAta(sayilar);
        System.out.println("yeni liste ata methdundan sonra " + sayilar);

        elementleriArtir(sayilar);
        System.out.println("elementleri artir methodundan sonra " + sayilar);

    }

    public static void elementleriArtir(List<Integer> sayilar) {

        //tum elementleri iki katina cikaralim

        for (int i = 0; i < sayilar.size() ; i++) {

            sayilar.set(i , 2*sayilar.get(i));


        }
        System.out.println("elementleri artir methdunda calistirdiktan sonra " + sayilar);

    }

    public static void yeniListeAta(List<Integer> sayilar) {

        //sayilar listesine yeni bir list degeri atayip 1,2,3 ekleyelim.

        sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("yeni liste olustur methoodundan sonra "+ sayilar);
    }
}
