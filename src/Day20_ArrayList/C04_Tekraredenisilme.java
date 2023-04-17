package Day20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Tekraredenisilme {
    public static void main(String[] args) {
        //verilen bir array den tekrar eden sayilari silip sadece bir kez kullanildigi
        //bir hale donustur

        int[] arr= {3,4,5,3,7,8,4,5,6,8,1,9,1};

        List<Integer> benzersizelementlerList= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!benzersizelementlerList.contains(arr[i])){

                benzersizelementlerList.add(arr[i]);

            }

        }
        System.out.println(benzersizelementlerList);
       arr= new int[benzersizelementlerList.size()];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=benzersizelementlerList.get(i);

        }
        System.out.println(Arrays.toString(arr));


    }
}
