package Day17;

import java.util.Arrays;

public class Arrays_17gun {
    public static void main(String[] args) {

        String[] isimler={"Nurefsan","Berke","Mustafa"};
        int[] sayilar={3,5,2,4,3,6,8,5,3};
        char[] karakter={'e','4',','};

        String[] arr=new String[5];

        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(arr));

        int[] a= new int[7];
        System.out.println(Arrays.toString(a));

        a[0]=4;
        a[4]=7;
        System.out.println(Arrays.toString(a));
        //ya da
        System.out.println(sayilar[5]);
        System.out.println(isimler[2]);
    }


}
