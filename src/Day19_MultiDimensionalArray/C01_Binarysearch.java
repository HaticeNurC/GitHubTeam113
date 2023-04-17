package Day19_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Binarysearch {
    public static void main(String[] args) {

        int[] arr={4,8,5,3,2,9,12,7};

        //Array de binarySearch in duzgun calismasi icin oncelikle sort calistirilmali

        Arrays.sort(arr);//{2,3,4,5,7,8,9,12}
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 4));


        //binarysearch aranan elementin indeksini doner.

        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 15));
    }
}
