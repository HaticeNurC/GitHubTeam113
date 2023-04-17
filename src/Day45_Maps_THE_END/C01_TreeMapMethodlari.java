package Day45_Maps_THE_END;

import java.util.TreeMap;

public class C01_TreeMapMethodlari {
    public static void main(String[] args) {

        TreeMap<String ,Integer> deneme= new TreeMap<>();

        deneme.put("F",20);
        deneme.put("T",30);
        deneme.put("A",10);
        deneme.put("M",25);
        deneme.put("Z",30);

        System.out.println(deneme);

        System.out.println(deneme.tailMap("F"));//{F=20, M=25, T=30, Z=30}
        System.out.println(deneme.tailMap("C"));//{F=20, M=25, T=30, Z=30}
        System.out.println(deneme.tailMap("O"));//{T=30, Z=30}

        //varsa verilen key den baslayip son kadar dondurur
        //yoksa olsaydi nerede olurduyu bulup sonrasini dondurur

        System.out.println(deneme.tailMap("M",false));//{T=30, Z=30}

        //javada baslangic degerleri inclusive dir eger tail alirken verdigimiz
        //baslangic keyin dahil olmasini istemezsek false parametresini yazdirabiliriz

        System.out.println(deneme.headMap("M"));//{A=10, F=20}
        System.out.println(deneme.headMap("O"));//{A=10, F=20, M=25}
        System.out.println(deneme.headMap("T",true));//{A=10, F=20, M=25, T=30}

        System.out.println(deneme.pollLastEntry());//Z=30
        System.out.println(deneme);//{A=10, F=20, M=25, T=30}
        //ilk veya son entryi silip sildigi entryi bize dondurur

        System.out.println(deneme.pollFirstEntry());//A=10
        System.out.println(deneme);//{F=20, M=25, T=30}

        System.out.println(deneme.higherKey("M"));//T
        System.out.println(deneme.higherKey("C"));//F
        System.out.println(deneme.higherEntry("F"));//M=25

        //verdigimiz keyden buyuk olan ilk entryi dondurur

        System.out.println(deneme.lowerKey("M"));//F
        System.out.println(deneme.lowerEntry("K"));//F=20

        System.out.println(deneme.floorKey("M"));//M
        System.out.println(deneme.floorKey("K"));//F
        System.out.println(deneme.ceilingKey("K"));//M
        System.out.println(deneme.ceilingKey("T"));//T

        //higher ve lower dan farki buyukesit kucukesit gibi dusunmeleridir

        System.out.println(deneme.subMap("K","O"));//M=25
        System.out.println(deneme.subMap("F", "O"));//F=20,M=25

        //baslangic key inclusive bitis key exclusive olarak aralarindaki entryi dondurur


    }
}
