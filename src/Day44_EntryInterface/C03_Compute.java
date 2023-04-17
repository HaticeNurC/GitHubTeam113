package Day44_EntryInterface;

import java.util.Map;
import java.util.TreeMap;

public class C03_Compute  {
    public static void main(String[] args) {
        Map<String,Integer> ornekMap= new TreeMap<>();

        ornekMap.put("A",20);
        ornekMap.put("B",15);
        ornekMap.put("K",25);
        ornekMap.put("M",20);
        ornekMap.put("T",30);

        System.out.println(ornekMap);

        //eger map te A degeri varsa degerini 40 yap

        ornekMap.computeIfPresent("A",(k,v)-> v=40);
        System.out.println(ornekMap);

        //map te B yoksa B yi deger olarak 50 ile ekle

        ornekMap.computeIfAbsent("B",v-> 50);
        ornekMap.putIfAbsent("B",50);
        System.out.println(ornekMap);

        //map te K varsa degerini 2 katina cikar

        ornekMap.computeIfPresent("K", (a,b)-> b*2);
        System.out.println(ornekMap);
        //yani illaki k,v yazmak sart degil baska harflerle de belirtebiliriz

        //eger T varsa degerini 10 azalt

        ornekMap.computeIfPresent("T",(v,k)-> k-10);
        System.out.println(ornekMap);

        //eger C yoksa degeri 30 olarak ekle
        ornekMap.computeIfAbsent("C", v->30);
        System.out.println(ornekMap);



    }
}
