package Day18_Arrays;

import java.util.Arrays;

public class C01_Arraysorucoozumu {
    public static void main(String[] args) {

        //verilen bir int arrayin tum elemanlarini 2 artirip eski array e ata

        int[] arr={2,3,6,7};
        arr=  arrayElementleriniArtir( arr,2);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] arrayElementleriniArtir(int[] ilkArr, int Artis){
        for (int i = 0 ; i < ilkArr.length ; i++) {
            ilkArr[i] +=Artis;

        }
        return ilkArr;

    }
}
