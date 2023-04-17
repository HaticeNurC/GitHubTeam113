package Day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Get_Set_Sublist {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar);

        System.out.println(sayilar.get(0)); //3
        //son elementi yazdirmak icin

        System.out.println(sayilar.get(sayilar.size()-1));

        //2 yi 12 yap

        System.out.println(sayilar.set(2,12)); //2

        //5 i 7 yapmak icin once index numarasi sonra yerine koyacagimiz numara yazilir

        System.out.println(sayilar.set(1,7));

        System.out.println(sayilar);

        //Sublist
        System.out.println(sayilar.subList(0,2));

        List<Integer> yenilist= sayilar.subList(1,2);

        System.out.println(yenilist);
    }
}
