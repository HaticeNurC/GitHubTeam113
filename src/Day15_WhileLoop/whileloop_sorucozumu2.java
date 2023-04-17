package Day15_WhileLoop;

import java.util.Scanner;

public class whileloop_sorucozumu2 {
    public static void main(String[] args) {

        //kullanicidan bir sifre isteyin, sartlari saglayana kadar sifreyi isteyin
        //"5.denemede basarili sekilde sifre olusturuldu seklinde yazdirin"
        //sartlar;-ilk harf kucuk olmali,
        //-son harf buyuk olmali, -bosluk icermemeli,-8 karakterden uzun olmali.

        Scanner scan=new Scanner(System.in);


        String sifre="";
        int flag=0;
        int denemesayisi=0;

        while (flag !=4) {
            System.out.println("Lutfen bir sifre olusturunuz");
            sifre = scan.nextLine();

            //1.sart;ilk harf kucuk olmali
            if (sifre.charAt(0)>='a'&& sifre.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("Ilk karakter kucuk harfle baslamali");
            }
            //2.sart; son harf buyuk olmali
            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1) <='Z') {
                flag++;
            } else {
                System.out.println("Son karakter buyuk harfle bitmeli");
            }
            //3.sart;sifre bosluk icermemeli
            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            }else {
                flag++;
            }
            //4.sart sifre 8 karakterden uzun olmali.
            if (sifre.length()>8){
                flag++;
            }else {
                System.out.println("Sifre 8 karakterden uzun olmali");
            }
            denemesayisi++;
            System.out.println("Sifreniz" + denemesayisi+"."+ "sonra basariyla olusturulmustur.");


        }

    }

        }


