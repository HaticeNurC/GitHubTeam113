package Day17;

import java.util.Arrays;

public class Arrayelemanlariyazdirma_degistirme {
    public static void main(String[] args) {

        int[] arr={1,3,2,9,5,7};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println("=============");

        int[] fiyatlar={10,45,23,89};

        for (int i = 0; i < fiyatlar.length ; i++) {

            fiyatlar[i]+=3;

        }
        System.out.println(Arrays.toString(fiyatlar));

    }
}
