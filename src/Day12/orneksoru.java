package Day12;

import java.util.Scanner;

public class orneksoru {


    public static void main(String[] args) {

        //kullanicidan bir karakter isteyin,sifrenin su kosullara uygunlugunu test edin
        //ilk harf kucuk olmali,son karakter rakam olmali, sifre bsluk icermemeli, uzunlugu en az
        // on karakter olmali.Hepsi uygunsa "sifreniz basariyla kaydedildi"yazin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre olusturunuz.");

        int flag=0;
        String sifre="a123mviu23";
        if(sifre.charAt(0)>='a'&&  sifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("ilk harf kucuk olmali");
        }
        char sonharf= sifre.charAt(sifre.length()-1);
        if(sonharf>='0' && sonharf<='9'){
            flag++;
        }else{
            System.out.println("son harf rakam olmali");
        }
       if (sifre.contains(" ")){
           System.out.println("sifre bosluk icermemeli");
       } else{
           flag++;
       } if (sifre.length()>=10){
           flag++;

        }else {
            System.out.println("sifre on karakter ya da daha uzun olmali");
        } if (flag==4){
            System.out.println("sifre basariyla kaydedilmistir.");
        }




    }
}
