package Day26_Localtime_varargs;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        topla(3,4);
        topla(3,4,5);
        topla(3,4,5,6,7);
        topla(6,8,9,3,4,5,6);

    }
    public static void topla(int...a){
        System.out.println(Arrays.toString(a));

        int toplam= 0;

        for (int each:a
             ) {
            toplam+=each;

        }
        System.out.println("Toplam : " + toplam);
    }
}
