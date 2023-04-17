package Day22_Foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_listedetekraretmeme {
    public static void main(String[] args) {

        int[] arr={3,4,5,6,3,5,8,9,1,2,3,6};

        List<Integer> benzersizelementlistesi= new ArrayList<>();

        for (int each:arr
             ) {
            if (!benzersizelementlistesi.contains(each)){

                benzersizelementlistesi.add(each);
            }

        }
        System.out.println(benzersizelementlistesi);

        arr= new int[benzersizelementlistesi.size()];

        System.out.println(Arrays.toString(arr)); //[0,0,0,0,0] gibi bir sey atadi

        for (int i = 0; i < arr.length ; i++) {

            arr[i]= benzersizelementlistesi.get(i);


        }
        System.out.println(Arrays.toString(arr));
    }
}
