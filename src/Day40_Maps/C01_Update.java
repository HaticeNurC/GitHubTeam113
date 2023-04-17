package Day40_Maps;

import Day39_Maps.MapMethodDepo;

import java.util.Map;

public class C01_Update {
    public static void main(String[] args) {

        //verilen mapte sube ismi M olanlarin subesini N yapin

        Map<Integer, String > okulMap= MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        System.out.println(okulMap.get(101));
        okulMap.put(101,"Ali-Cem-10-M-MF");
        okulMap.put(102,"Kemal-Can-11-M-Soz");
        System.out.println(okulMap);

        //Update yaparken

        //1-once key leri bir set olarak kaydedelim
        //2-her bir key e ait valueyi split ile array e donusturelin\m
        //3-sube bilgisi eski sube olanlari yenisube yapalim
        //4-arraydeki bilgileri birlestirerek,yeniden map e ekleyelim(Yeni)
        //5-okul mapin son halini return edelim

        //6-return edilen yeni halini eski okulmap e assign edelim(atayalim)
        okulMap= MapMethodDepo.topluSubeDegistirme(okulMap,"M","N");

    }


}
