package Day18_Arrays;

import java.util.Arrays;

public class C03_ArrayeElemanekleme {
    public static void main(String[] args) {

        int[] arr={4,5,6};
        int eklenecekeleman=10;
        int[] yeniarr= new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            yeniarr[i]=arr[i];

        }
        yeniarr[yeniarr.length-1] = eklenecekeleman;
        System.out.println(Arrays.toString(yeniarr));
        arr=yeniarr;
        System.out.println(Arrays.toString(arr));

    }
}
