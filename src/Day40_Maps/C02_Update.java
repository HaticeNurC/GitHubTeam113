package Day40_Maps;

import Day39_Maps.MapMethodDepo;

import java.util.Map;

public class C02_Update {
    public static void main(String[] args) {
        //verilen okul mapindeki ogrencilerin sinifini bir artirin
        //eger 12.sinif ise mezun yapin

        Map<Integer,String> okulMap= MapMethodDepo.ornekMapOlustur();
        okulMap=MapMethodDepo.yilsonusiniflaridegistir(okulMap);

        System.out.println(okulMap);

        okulMap= MapMethodDepo.yilsonusiniflaridegistir(okulMap);
        System.out.println(okulMap);

        okulMap= MapMethodDepo.yilsonusiniflaridegistir(okulMap);
        System.out.println(okulMap);
    }
}
