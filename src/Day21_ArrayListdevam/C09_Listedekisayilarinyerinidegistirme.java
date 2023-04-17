package Day21_ArrayListdevam;

import java.util.ArrayList;
import java.util.List;

public class C09_Listedekisayilarinyerinidegistirme {

    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(9);
        sayilar.add(7);

        System.out.println(sayilar);

        //2. indexteki degeri 4.indextekiyle yer degistir.


        int temp=sayilar.get(2);
        sayilar.set(2,sayilar.get(4));
        sayilar.set(4,temp);

        System.out.println(sayilar);


    }
}
