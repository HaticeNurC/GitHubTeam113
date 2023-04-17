package Day18_Arrays;

import java.util.Arrays;

public class sorucozumu {
    public static void main(String[] args) {
        //verilen int bir arraydeki tum elementleri bir saga kaydir
        //sondaki elementi de en basa alip kaydet
        //or;{3,4,5,6}  son hali :{6,3,4,5} yap

        int[] arr={3,4,5,6,8};
        int temp= arr[arr.length-1];

        for (int i = 0; i <arr.length-1 ; i++) {

            arr[arr.length-1-i]=arr[arr.length-2-i];

        }
        arr[0]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
