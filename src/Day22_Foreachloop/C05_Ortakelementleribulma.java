package Day22_Foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C05_Ortakelementleribulma {
    public static void main(String[] args) {

        //Verilen iki arrayin elementlerini karsilastirip
        //ikisinde de ortak olan elementleri
        //ayri bir liste olarak verilen bir program yazin

        int[] arr1={2,3,6,7,4,7};
        int[] arr2={1,3,5,7,9,3};

        List<Integer> ortakelementlerListesi= new ArrayList<>();

        for (int each1: arr1) {
            for (int each2: arr2) {

                if (each1==each2 && !ortakelementlerListesi.contains(each1))
                ortakelementlerListesi.add(each1);
            }

        }
        System.out.println(ortakelementlerListesi);
    }
}
