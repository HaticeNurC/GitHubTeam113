package Day21_ArrayListdevam;

import java.util.ArrayList;
import java.util.List;

public class C02_Indexof {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();

        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");
        isimler.add("Mustafa");

        System.out.println(isimler);

        //2.indexteki elementi yazdir

        System.out.println(isimler.get(2));

        //Ferhat in indexini yazdir

        System.out.println(isimler.indexOf("Ferhat"));
        System.out.println(isimler.lastIndexOf("Ferhat")); //lastindexof sondan saymaya baslar

        System.out.println(isimler.indexOf("Mustafa"));
        System.out.println(isimler.lastIndexOf("Mustafa"));

    }
}
