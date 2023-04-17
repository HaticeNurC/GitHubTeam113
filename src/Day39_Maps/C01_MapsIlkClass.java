package Day39_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapsIlkClass {

    public static void main(String[] args) {

        Map<Integer,String> okulMap= new HashMap<>();

        okulMap.put(101, "Ali,Cem,10,H,MF");
        okulMap.put(102, "Veli,Can,10,M,MF");
        okulMap.put(103, "Ali,Can,10,M,MF");
        okulMap.put(104, "Ayse,Cem,10,H,MF");
        okulMap.put(105, "Ayse,Han,10,H,MF");
        okulMap.put(106, "Veli,Han,10,H,MF");

        System.out.println(okulMap);

        //map te kac element var?
        System.out.println(okulMap.size());

        //map teki tum key ler
        System.out.println(okulMap.keySet());

        //tum valuelar
        System.out.println(okulMap.values());

        System.out.println(okulMap.values().size());

    }
}
