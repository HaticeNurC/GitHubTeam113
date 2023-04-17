package Day15_WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan tamsayilar alin ve bu sayilarin toplami 500 u gecince
        //kac sayi girdigini ve toplamini yazdirin

        Scanner scan=new Scanner(System.in);

        int girilensayi=0;
        int girilensayiadedi=0;
        int toplam=0;

        while (toplam < 500){
            System.out.println("Lutfen toplanmak uzere tamsayilar girin");
            girilensayi= scan.nextInt();
            toplam+=girilensayi;
            girilensayiadedi++;

        }
        System.out.println("toplam : "+ girilensayiadedi + "Toplam: "+ toplam);
    }
}
