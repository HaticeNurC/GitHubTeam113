package Day21_ArrayListdevam;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_istenmeyenharf {
    public static void main(String[] args) {
        //verilen string bir listede istenmeyen harf iceren elementleri silip
        //kalan kismini list olarak bize donduren bir method olustur

        List<String> Liste= C03_KullaniciyaListOlusturtma.kullaniciyalistolusturtma();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kullanilmasini istemediginiz bir harf girin");
        String istenmeyenharf= scan.next().substring(0,1); //istenmeyen harf

        List<String > ayiklanmisList= istenmeyenHarfIcerenleriSil(Liste,istenmeyenharf);
        System.out.println(ayiklanmisList);



    }

    public static List<String> istenmeyenHarfIcerenleriSil(List<String> Liste,String
            istenmeyenHarf){
        //Listemiz ali,ayse ,veli ve istenmeyen hafr a
        //for loop ile elementleri ele alirken remove yaparsak
        //listin uzunlugu degisecegi icin sorun yasariz
        //farkli bir list olusturup, silinmeyecekleri yeni listeye ekleyelim

        List<String > kalanlarlistesi= new ArrayList<>();
        for (int i = 0; i < Liste.size() ; i++) {
            if (!Liste.get(i).contains(istenmeyenHarf)){
                kalanlarlistesi.add(Liste.get(i));
            }

        }

          return kalanlarlistesi;


    }
}
