package Day14_;

import java.util.Scanner;

public class Tersmetinmethodkullanma {
    public static void main(String[] args) {
        //verilen stringi POLINDROME olup olmadigini yazdirin
        //madam, kabak,nalan,12321

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir metin yaziniz");

        String metin= scan.nextLine();

        String tersmetin= C03_stringiterscevirme.stringterscevir(metin);

        if (metin.equals(tersmetin)){
            System.out.println("Metin Poolindrome dir.");
        } else {
            System.out.println("Metin Polindrome degildir");
        }


    }
}
