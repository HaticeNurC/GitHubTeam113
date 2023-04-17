package Day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Indexremove {
    public static void main(String[] args) {

        List<Integer>sayilar= new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar);


        sayilar.remove(1);
        System.out.println(sayilar);//3 u siler

        //eger 1 rakamini silmek istiyorsak silinecek sayiyi atamamiz gerekiyor

        Integer silineceksayi=1;
        sayilar.remove(silineceksayi);
        System.out.println(sayilar);
    }
}
