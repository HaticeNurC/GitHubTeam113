package Day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Listcikarma {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("S");
        harfler.add("K");
        System.out.println(harfler);

        System.out.println(harfler.remove("S"));//S yi siler ama boolean old icin true verir
        System.out.println(harfler);

        System.out.println(harfler.remove(0));//A yi siler sildigi ogeyi gosterir
        System.out.println(harfler);


        List<Integer>sayilar= new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);




    }
}
