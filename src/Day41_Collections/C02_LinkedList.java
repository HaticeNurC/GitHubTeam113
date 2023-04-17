package Day41_Collections;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {

        List<String> harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");

        System.out.println(harfler);

        harfler.add(3,"T");
        System.out.println(harfler);

        harfler.set(3,"R");
        System.out.println(harfler);

        List<String> semboller=new LinkedList<>();

        semboller.add("H");
        semboller.add("#");
        semboller.add("&");
        semboller.add("*");

        System.out.println(semboller);

        System.out.println(harfler.retainAll(semboller));//
        System.out.println(semboller);
        System.out.println(harfler);

        harfler.addAll(semboller);
        System.out.println(harfler.removeAll(semboller));
        System.out.println(harfler);
    }
}
