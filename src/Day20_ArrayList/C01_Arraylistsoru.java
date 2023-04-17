package Day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Arraylistsoru {
    public static void main(String[] args) {

        List<String>harfler= new ArrayList<>(); //bos bir list olusturur

        System.out.println(harfler);

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler);

        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        System.out.println(sayilar);


        //3 ile 5 arasina 7 eklemek istiyorum
        sayilar.add(1,7);
        System.out.println(sayilar);

        List<Integer>ekler= new ArrayList<>() ;
        ekler.add(4);
        ekler.add(6);
        System.out.println(ekler);

        sayilar.addAll(ekler);
        System.out.println(sayilar);

        //7 ile 5 arasina ekleri ekle

        sayilar.addAll(2,ekler);
        System.out.println(sayilar);


    }
}
