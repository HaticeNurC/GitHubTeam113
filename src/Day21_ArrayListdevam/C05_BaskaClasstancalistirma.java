package Day21_ArrayListdevam;

import java.util.ArrayList;
import java.util.List;

public class C05_BaskaClasstancalistirma {
    public static void main(String[] args) {
        //C04 teki methodu kullanalim

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        String istenmeyenharf= "o";

        System.out.println(C04_istenmeyenharf.istenmeyenHarfIcerenleriSil(urunler, istenmeyenharf));
    }
}
