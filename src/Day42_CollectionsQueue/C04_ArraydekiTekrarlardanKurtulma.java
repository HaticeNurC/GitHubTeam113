package Day42_CollectionsQueue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {

        //soru: Verilen bir arraydeki tekrar eden elementleri sadece 1 kere yazdiracak arrayi
        //kisaltan bir kod yaziniz(set kullanarak)

        int[] arr={1,3,7,2,5,8,6,7,4,3,2,9,8};

        Set<Integer> benzersizSet= new HashSet<>();

        //arraydeki tum elementleri olusturdugumuz sete ekleyelim
        for (int each:arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);
        System.out.println(Arrays.toString(arr)); //[1, 3, 7, 2, 5, 8, 6, 7,4, 3, 2, 9, 8]

        arr=new int[benzersizSet.size()];//[0,0,0,0,0,0,0,0,0]
        int index=0;
        for (int each:benzersizSet
             ) {
            arr[index]=each;
            index++;

        }
        System.out.println("arrayin son hali: "+ Arrays.toString(arr));

    }
}
