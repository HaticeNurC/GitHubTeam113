package Day43_HashMekanizmasi;

import java.util.*;

public class C01_MixSet {
    public static void main(String[] args) {
        Set<Object> mixSet= new HashSet<>();

        mixSet.add(12);
        mixSet.add("Java");
        mixSet.add('S');
        mixSet.add(true);

        int[] arr=new int[3];
        mixSet.add(arr);

        List<Object> mixList=new ArrayList<>();
        mixList.add("Hava");
        mixList.add(24);

        mixSet.add(mixList);
        System.out.println(mixList);
        System.out.println(mixSet);

        System.out.println(mixSet.size());
        System.out.println(mixSet.contains(24));
        System.out.println(mixSet.contains(12));
        System.out.println(Arrays.toString(arr));
        //object secmemizin amaci srting ve integer yapilarin birarada kullanilmasindan
        //ancak elementlere ulasmamiz ya da update etmek gibi islemler cok zor olur yada mumkun olmaz

    }
}
