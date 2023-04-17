package Day12;

public class forloops_orneksoruczumu {
    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin
        //sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin
        //bitis degeri baslangic degerinden buyukse uyari verin

        int bas=45;
        int bit=567;

        int sayitoplami=0;
        if (bit<bas){
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");
        } else {
            for (int i = bas; i <=bit ; i++) {
                //bu sekilde yazdirirsan dinamik kodlama yapmis oluruz ve bas ve bit e
                //hangi deger verilirse kod oyle calisir.

                //sayitoplami= sayitoplami+i seklinde de yazilir ama kullanilmaz

                sayitoplami+=i ;


            }
            System.out.println("Sayilartoplami :" + sayitoplami);
        }
    }

}
