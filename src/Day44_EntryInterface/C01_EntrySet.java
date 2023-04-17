package Day44_EntryInterface;

import Day39_Maps.MapMethodDepo;

import java.util.Map;

public class C01_EntrySet {
    public static void main(String[] args) {

        Map<Integer,String> okulMap= MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        MapMethodDepo.sinifaoreListeYazdir(okulMap,10);


    }
}
