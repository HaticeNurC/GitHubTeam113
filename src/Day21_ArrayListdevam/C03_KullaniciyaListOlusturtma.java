package Day21_ArrayListdevam;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class C03_KullaniciyaListOlusturtma {
    public static void main(String[] args) {

        System.out.println(kullaniciyalistolusturtma());

    }

    //Kullanicidan istedigi kadar isim alip
    //Q ya bastiginda girdigi isimleri bize list olarak dondurecek bir method olusturun

    public static List<String> kullaniciyalistolusturtma(){
        List<String>isimler=new ArrayList<>();
        String girilenisim="";
        Scanner scan=new Scanner(System.in);

        do{
            System.out.println("Listeye eklemek icin bir isim girin" +
                   " \\nBitirmek icin Q ya basin");
            girilenisim=scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }
        }while (!girilenisim.equalsIgnoreCase("Q"));

        return isimler;




    }
}
