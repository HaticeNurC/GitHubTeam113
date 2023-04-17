package Day39_Maps;

import java.util.Map;

public class C02_Maps {

    public static void main(String[] args) {

        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();

            okulMap.put(110, "Kerem,Umut,12,K,MF");

            System.out.println(okulMap.keySet());

            System.out.println(okulMap.values());

            //verilen subedeki ogrencilerin

            MapMethodDepo.subeogrenciListesiYazdir(okulMap, "H");


        }
    }

