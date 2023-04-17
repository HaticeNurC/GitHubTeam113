package Day44_EntryInterface;

import Day39_Maps.MapMethodDepo;

import java.util.Map;

public class C02_EntrySet2 {
    public static void main(String[] args) {
        //verilen okulMap indeki soyisimleri buyuk harfe cevirin

        Map<Integer,String> okulMap= MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap= MapMethodDepo.soyisimleriBuyukharfYap(okulMap);
        System.out.println(okulMap);
    }
}
