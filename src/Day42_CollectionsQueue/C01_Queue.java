package Day42_CollectionsQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        Queue<String> harfler= new LinkedList<>();

        harfler.add("H");
        harfler.add("M");
        harfler.add("K");
        harfler.add("L");
        harfler.add("H");

        System.out.println(harfler.remove());
        System.out.println(harfler);

        harfler.remove();
        System.out.println(harfler);//ilk harfi siler

        harfler.add("A");
        harfler.add("B");

        System.out.println(harfler.element());
        System.out.println(harfler.peek());

        Queue<String>karakterler=new LinkedList<>();

        System.out.println(karakterler.peek());//null yazdirir
       // System.out.println(karakterler.element());//eger bossa list exception firlatir

        System.out.println(harfler.poll());
        System.out.println(harfler);

        System.out.println(karakterler.offer("*"));
        System.out.println(karakterler);




    }
}