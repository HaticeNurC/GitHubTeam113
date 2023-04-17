package Day42_CollectionsQueue;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("K");
        System.out.println(harfler);

        harfler.addFirst("B");
        System.out.println(harfler);
        harfler.remove(); //ilk eleenti cikariyor
        System.out.println(harfler);

        harfler.addFirst("T");
        harfler.addLast("T");
        harfler.add("L");
        System.out.println(harfler);

        System.out.println(harfler.removeLastOccurrence("T"));
        System.out.println(harfler);
        System.out.println(harfler.removeFirstOccurrence("R"));//false
        System.out.println(harfler);

        System.out.println(harfler.peekFirst());
        System.out.println(harfler.peekLast());
        System.out.println(harfler.hashCode());

        LinkedList<String> karakterler=new LinkedList<>();
         karakterler.add("*");
         karakterler.add("?");
        System.out.println(karakterler);
        karakterler.push("&");//basa ekledi
        System.out.println(karakterler);

        LinkedList<String> copy= (LinkedList<String>) karakterler.clone();
        System.out.println(copy);

    }
}
