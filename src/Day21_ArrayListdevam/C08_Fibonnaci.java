package Day21_ArrayListdevam;

import java.util.ArrayList;
import java.util.List;

public class C08_Fibonnaci {
    public static void main(String[] args) {
        //Verilen n tane pzitif tam sayisini alarak bize ilk n tane
        //fibonacci sayisini bir list olarak donduren bir method olusturun

        System.out.println(istenensayidaFibonnacisayilistesi(10));
        System.out.println(istenensayidaFibonnacisayilistesi(15));




    }
    public static List<Integer>  istenensayidaFibonnacisayilistesi(int sayiAdedi){

        List<Integer> fibonnacisayiListesi = new ArrayList<>();

        if (sayiAdedi<=0){
            System.out.println("Yanlis giris");
        } else if (sayiAdedi==1) {
            fibonnacisayiListesi.add(0);

        }else if (sayiAdedi==2){
            fibonnacisayiListesi.add(1);
        }else {
            int ilksayi = 0;
            fibonnacisayiListesi.add(ilksayi);
            int ikincisayi = 1;
            fibonnacisayiListesi.add(ikincisayi);
            int yenisayi = ilksayi + ikincisayi;
            fibonnacisayiListesi.add(yenisayi);
            while (fibonnacisayiListesi.size() <= sayiAdedi) {
                ilksayi = ikincisayi;
                ikincisayi = yenisayi;
                yenisayi = ilksayi + ikincisayi;
                fibonnacisayiListesi.add(yenisayi);

            }
        }
        return fibonnacisayiListesi;
    }
}
