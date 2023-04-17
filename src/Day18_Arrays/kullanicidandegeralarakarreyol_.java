package Day18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class kullanicidandegeralarakarreyol_ {
    public static void main(String[] args) {

        //kullanicidan arrey olusturmak icin pozitif tamsayilar alin
        //kullaniciya islemi bitirmesi icin 0 a basmasi gerektigini soyle
        //bir onceki class tan method kullanarak bunu yap

        Scanner scan= new Scanner(System.in);
        int girilensayi=1;
        int[] arr= new int[0];

        while( girilensayi!=0){
            System.out.println("Arraye eklemek icin pozitif tamsayilar girin" +
                    "\n islemi bitirmek icin 0 a basin.");

            girilensayi=scan.nextInt();

            if (girilensayi!=0){

                arr=  C003unmethodu.arrayeElementEkleme(arr,girilensayi);
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    }

