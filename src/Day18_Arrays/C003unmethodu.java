package Day18_Arrays;

import java.util.Arrays;

public class C003unmethodu {
    public static void main(String[] args) {

        int[] arr = {2, 4, 7};

        arr= arrayeElementEkleme(arr, 19);

        System.out.println(Arrays.toString(arr));

    }

    //verilen bir arraye istenen bir elementi ekleyip
    //yeni halini bize donduren bir method olusturun
    public static int[] arrayeElementEkleme(int[] arr, int ekelenecekelement) {

        int[] yeniarr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            yeniarr[i] = arr[i];


        }
        yeniarr[yeniarr.length - 1] = ekelenecekelement;
        return yeniarr;



    }

}
