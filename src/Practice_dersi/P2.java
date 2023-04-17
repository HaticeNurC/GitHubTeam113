package Practice_dersi;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        //Kullanicidan ad/soyad/yas/mail adresi/sifre bilgileirni alip
        //sisteme kaydedildigini asagidaki formatta yaziniz
        //Adiniz: Tarik
        //Soyadiniz:Yigit...

        Scanner scan= new Scanner(System.in);
        /*System.out.println("Lutfen adinizi giriniz");
        String name= scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String surname= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail= scan.next();
        System.out.println("Lutfen bir sifre belirleyiniz");
        String password= scan.next();

        System.out.println("*****   KAYIT BASARILI     *****"  );
        System.out.println("Adiniz : " + name);
        System.out.println("Soyadiniz : " + surname);
        System.out.println("Yas : "+ yas);
        System.out.println("Mail :"+ mail);
        System.out.println("Password : "+ password);

        System.out.println("==========================");

        //Kullanici: H.Ciftci ,31 seklinde yazdir

        System.out.println("Kullanici " + name.charAt(0)+ "." + surname.toUppercase()+ "," + yas); */

        //Kullanicidan ucgenin kenarini ve o kenarin yuksekligini isteyerek ucgenin alanini hesapla yazdir

        int a=100, h=120;
        System.out.println("Ucgenin alani: " + (a*h/2) );

        //Kullanicidan iki sayi alip ucuncu bir degisken kullanmadan sayi degerlerini degistirin(swap)

        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("1.sayi: "+ sayi1 + "\n 2.sayi: "+ sayi2);

        sayi1=sayi1+sayi2;
        sayi2= sayi1-sayi2;
        sayi1= sayi1-sayi2;
        System.out.println("sayi 1: "+ sayi1 + "\n sayi2 : " + sayi2);





    }
}
