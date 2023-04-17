package Day42_CollectionsQueue;

import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    public static void main(String[] args) {
        Set<String> ogrenciler=new TreeSet<>();

        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");

        System.out.println(ogrenciler);
        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);
        ogrenciler.add("Kerem");
        System.out.println(ogrenciler);//tekrara dusurmedi ve yeni Keremi ekledi
    }
}
