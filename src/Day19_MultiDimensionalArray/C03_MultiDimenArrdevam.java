package Day19_MultiDimensionalArray;

import java.util.Arrays;

public class C03_MultiDimenArrdevam {
    public static void main(String[] args) {

        int[][] arr={{3,4,5},{2,6},{1}};

        System.out.println(arr[1][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[2].length);
        System.out.println(arr[1]);//referansini yazdirir
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr));//ucunun de referanslarini yazdirir

        //eger hepsini uygun bir sekilde yazdirmak istiyorsak

        System.out.println(Arrays.deepToString(arr));

        System.out.println(arr.length);


        String [][] siniflar= {{"a,b,c,d"},{"f,g,s"},{"o"}};

        System.out.println(siniflar[0][2]);//c
        //O yu x yap
        siniflar[2][0]="X";
        //ilk sinifin mevcudu
        System.out.println(siniflar[0].length);

        //siniflarda toplam kac kisi oldugunu yazdirin
        int toplamOgrSayisi=0;

        for (int i = 0; i <siniflar.length ; i++) {
            toplamOgrSayisi+=siniflar[i].length;

        }
        System.out.println(toplamOgrSayisi);
    }
}
