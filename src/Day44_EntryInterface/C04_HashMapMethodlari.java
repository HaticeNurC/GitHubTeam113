package Day44_EntryInterface;

import java.util.HashMap;
import java.util.Map;

public class C04_HashMapMethodlari {
    public static void main(String[] args) {

        Map<String,Integer > ornekMap= new HashMap<>();


        ornekMap.put("A",20);
        ornekMap.put("B",15);
        ornekMap.put("K",25);
        ornekMap.put("M",20);
        ornekMap.put("T",30);

        System.out.println(ornekMap);

        System.out.println(ornekMap.get("K"));
        System.out.println(ornekMap.getOrDefault("M", 60));
        System.out.println(ornekMap.getOrDefault("Z", 60));
        //verilen key varsa valuesini getirir ,yoksa verilen default degeri dondurur.

        System.out.println(ornekMap.replace("M",50));
        //verilen key varsa degerini update eder ve eski degeri dondurur.
        System.out.println(ornekMap);

        System.out.println(ornekMap.replace("T",30,90));//ture
        //verilen key in eski value su verilen deger ise update edip true doner
        //key in degeri verilen deger degilse bir islem yapmaz ve false dondurur

        System.out.println(ornekMap);

        System.out.println(ornekMap.replace("B",30,90));//false
        System.out.println(ornekMap);



    }
}
