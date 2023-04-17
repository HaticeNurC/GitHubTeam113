package Day39_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {


    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> okulMap = new HashMap<>();

        okulMap.put(101, "Ali,Cem,10,H,MF");
        okulMap.put(102, "Veli,Can,10,H,MF");
        okulMap.put(103, "Ali,Can,10,H,MF");
        okulMap.put(104, "Ayse,Cem,10,H,MF");
        okulMap.put(105, "Ayse,Han,10,H,MF");
        okulMap.put(106, "Veli,Han,10,H,MF");

        return okulMap;

    }

    public static Map<Integer, String> subeogrenciListesiYazdir(Map<Integer, String> okulMap, String istenenSube) {
        //1-valuelari ayri bir collection olarak kaydedelim
        Collection<String> valueCollection = okulMap.values();

        System.out.println("=========Sube Listesi========");
        System.out.println("Sira Sinif Isim Soyisim");
        int siraNo = 1;

        //2-her bir valueyi split ile bir arraye donusturelim
        for (String eachValue : valueCollection
        ) {
            String[] valueArr = eachValue.split("-");

            //3.Arrayden subeyi kontrol edip eger istenen sube ise ogrencinin
            //sinif isim ve soyismini yazdiralim

            if (valueArr[3].equalsIgnoreCase(istenenSube)) {

                System.out.println(siraNo + "," + valueArr[2] + " ," + valueArr[0] + "," + valueArr[1]);
                siraNo++;


            }

        }
        return okulMap;
    }

    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskisube, String yenisube) {
        //1-once key leri bir set olarak kaydedelim

        Set<Integer> OkulKeySeti = okulMap.keySet();//101,102,103,104,105,106

        for (Integer eachKey : OkulKeySeti
        ) {

            //2-her bir key e ait valueyi split ile array e donusturelim

            String[] valuearr = okulMap.get(eachKey).split("-");


            //3-sube bilgisi eski sube olanlari yenisube yapalim

            if (valuearr[3].equalsIgnoreCase(eskisube)) {

                valuearr[3] = yenisube;
            }


            //4-arraydeki bilgileri birlestirerek,yeniden map e ekleyelim(Yeni)

            String yenivalue = "";
            for (int i = 0; i < valuearr.length - 1; i++) {
                yenivalue += valuearr[i] + "-";

            }
            yenivalue += valuearr[valuearr.length - 1];
            okulMap.put(eachKey, yenivalue);

        }


        //5-okul mapin son halini return edelim
        return okulMap;


    }

    public static Map<Integer, String> yilsonusiniflaridegistir(Map<Integer, String> okulMap) {

        //1-keyleri bir set olarak kaydedelim
        Set<Integer> keySeti =okulMap.keySet();

        //2-Setteki herbir key e ait valueyu fr each loop ile ele alalim

        for (Integer eachkey: keySeti
             ) {

        //3-Her bir keydeki valueyu split ile ayiralim ve array olarak kaydedelim
            String[] valueArr= okulMap.get(eachkey).split("-");

        //4-Array olarak kaydettigimiz bilgilerde gereken updati yapalim

            if (valueArr[2].equalsIgnoreCase("12")){
                valueArr[2]="Mezun";
            }else {
                //stringi bir artirabilmek icin parseint kullanicaz

                int sinif= Integer.parseInt(valueArr[2]);
                sinif++;
                valueArr[2]=sinif+"";
            }
            //5-arrayin yeni halini string olarak birlestirip yeni value elde edelim
            String yenivalue="";
            for (int i = 0; i <valueArr.length-1 ; i++) {
                yenivalue+=valueArr[i]+"-";


            }yenivalue +=valueArr[valueArr.length-1];

             //6-herbir key ve yenivalue yu mape ekleyelim ve mapi update edelim

            okulMap.put(eachkey,yenivalue);
            
        }
             //7-mapin yeni halini update edelim
        return okulMap;

    }

    public static void sinifaoreListeYazdir(Map<Integer, String> okulMap, int istenenSinif) {

        //hedef istenen siniftaki ogrencilerin no,isim,soyisim ve bolumlerini bir liste olarak yazdirmak

        //1-okulmap teki entry leri kaydedelim
        Set<Map.Entry<Integer,String >> okulEntrySeti= okulMap.entrySet();

        //her bir entryi ele alip istenen islemi yaptiralim
        for (Map.Entry<Integer,String>eachEntry: okulEntrySeti
             ) {
            System.out.println(eachEntry.getKey() + " ");

            //isim soyisim ve bolumlerini alalim
            String value= eachEntry.getValue();
            String[] valueArr= value.split("-");

            if (valueArr[2].equals(istenenSinif+ "")){
                System.out.println(eachEntry.getKey()+ "");
                System.out.println(valueArr[0]+ ""+ valueArr[1]+ ""+ valueArr[4]);

                System.out.println("");
            }

        }
    }

    public static Map<Integer, String> soyisimleriBuyukharfYap(Map<Integer, String> okulMap) {
        //Entry ile cozelim
        Set<Map.Entry<Integer,String>> okulEntrySeti= okulMap.entrySet();
        //herbir entry i elden gecirip sadece soyisimleri buyuk yapalim

        for (Map.Entry<Integer,String> eachEntry:okulEntrySeti
             ) {

            //herbir entry deki valueyi alalim

            String value=eachEntry.getValue();

            //value yu arraye cevirelim
            String[] valueArr= value.split("-"); //[Veli,Can,10,M,TM]

            //array icindeki soyismi buyukharf yapalim

            valueArr[1]= valueArr[1].toUpperCase();

            eachEntry.setValue(valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+
                    valueArr[3]+"-"+valueArr[4]+"-");

        }
        return okulMap;
    }
}



