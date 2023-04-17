package Day43_HashMekanizmasi;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C02_HashSet_TreeSetkiyaslama {
    public static void main(String[] args) {

        Random rnd=new Random();
        int sayi;

        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();
        Long hashStart= System.currentTimeMillis();
        for (int i = 0; i <150000 ; i++) {
            sayi= rnd.nextInt(1250000);
            hashSet.add(sayi);

        }
        Long hashFinish= System.currentTimeMillis();

        Long treeStart=System.currentTimeMillis();
        for (int i = 0; i <150000 ; i++) {
            sayi= rnd.nextInt(1250000);
            treeSet.add(sayi);

        }
        Long treeFinish=System.currentTimeMillis();

        System.out.println("Hash islem suresi :" + (hashFinish-hashStart));
        System.out.println("Tree islem suresi :" + (treeFinish-treeStart));
    }
}
