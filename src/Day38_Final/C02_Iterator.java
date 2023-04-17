package Day38_Final;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(13);
        sayilar.add(2);
        sayilar.add(46);
        sayilar.add(78);

        //cift olan sailari sil

        Iterator it1=sayilar.iterator();

        while (it1.hasNext()){

            Integer sayi= (Integer) it1.next();

            if (sayi%2==0){
                it1.remove();
            }
        }
        System.out.println(sayilar);
    }
}
