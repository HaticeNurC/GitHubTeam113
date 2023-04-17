package Day27_StringBuilder;

public class C05_Stringbuilder_Devam {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");

        System.out.println(sb1.delete(4,5));

        System.out.println(sb1);

        System.out.println(sb1.deleteCharAt(9));

        System.out.println(sb1);

        sb1.insert(4," ");
        System.out.println(sb1);

        String str= " can bize gelecekmis";

        sb1.insert(10,str,0,5); //11.indekse eklenmesi icin str den 0. indeks ile 5.
        //indeks arasindaki yaziyi al demek

        System.out.println(sb1); //Java Candir can oldu

        sb1.replace(11,15,"Can."); //12.indeks ile 15.indeks arasina eklenecek
        //stringi yani Can. i yazdirdik

        System.out.println(sb1);

    }
}
