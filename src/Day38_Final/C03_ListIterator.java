package Day38_Final;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(13);
        sayilar.add(2);
        sayilar.add(46);
        sayilar.add(78);

        //tum elementleri index kullanmadan 3 artirin

        ListIterator lit= sayilar.listIterator();

        while (lit.hasNext()){

            Integer sayi= (Integer) lit.next();

            lit.set(sayi+3);
        }
        System.out.println(sayilar);
    }
}
