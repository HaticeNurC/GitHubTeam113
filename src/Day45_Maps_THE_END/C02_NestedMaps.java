package Day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {
    public static void main(String[] args) {
       /* okulMap.put(101, "Ali,Cem,10,H,MF");
        okulMap.put(102, "Veli,Can,10,M,TM");
        okulMap.put(103, "Ali,Can,10,M,Soz");*/

        //ogrencileri ayri ayri map yapsak

        Map<String ,String> ogrencimap1= new HashMap<>();
        ogrencimap1.put("Isim","Ali");
        ogrencimap1.put("Soyisim","Cem");
        ogrencimap1.put("Sinif", "10");
        ogrencimap1.put("Sube", "H");
        ogrencimap1.put("Bolum", "MF");

        Map<String,String> ogrencimap2= new HashMap<>();
        ogrencimap2.put("Isim","Veli");
        ogrencimap2.put("Soyisim","Can");
        ogrencimap2.put("Sinif", "10");
        ogrencimap2.put("Sube", "M");
        ogrencimap2.put("Bolum", "TM");

        Map<String,String> ogrencimap3=new HashMap<>();
        ogrencimap3.put("Isim","Ali");
        ogrencimap3.put("Soyisim","Can");
        ogrencimap3.put("Sinif", "10");
        ogrencimap3.put("Sube", "M");
        ogrencimap3.put("Bolum", "Soz");

        Map<Integer,Map<String,String>> okulMap= new HashMap<>();
        okulMap.put(101,ogrencimap1);
        okulMap.put(102,ogrencimap2);
        okulMap.put(103,ogrencimap3);

        System.out.println(okulMap);

        //101 numarali ogrencinin sinifini yazdirin
        System.out.println(okulMap.get(101).get("Sinif"));

        //103 numarali ogrenci ile 102 numarali ogrencinin subeleri ayni mi

        System.out.println(okulMap.get(103).get("Sube").equals(okulMap.get(102).get("Sube")));//true


    }
}
