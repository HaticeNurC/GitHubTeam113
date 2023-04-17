package Day21_ArrayListdevam;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,7,2,9,6,0,5,3,6,8,3};

        List<Integer>sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);

        //listte 3 var mi kontrolu
        System.out.println(sayilar.contains(12));

        System.out.println(sayilar.contains(9));

        //eger clear i secersek listenin elemanlarini siler ve geri donmez

        sayilar.clear();
        System.out.println(sayilar );
    }
}
