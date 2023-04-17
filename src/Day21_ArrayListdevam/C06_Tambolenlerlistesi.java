package Day21_ArrayListdevam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_Tambolenlerlistesi {
    public static void main(String[] args) {
        //kullanicidan main methodda pozitif bir tamsayi alip
        //o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //bir liste olarak bize donduren bir method olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif tam bolenleri bulunmak uzere " +
                "pozitif bir tamsayi girin");
        int verilensayi= scan.nextInt();

        System.out.println(pozitifbolenlerilistele(verilensayi));

    }
    public static List<Integer> pozitifbolenlerilistele(int verilensayi){

        List<Integer> poziifbolenlerlistesi= new ArrayList<>();

        for (int i = 1; i <=verilensayi ; i++) {
            if (verilensayi%i==0){
                poziifbolenlerlistesi.add(i);
            }

        }
        return poziifbolenlerlistesi;
    }
}
