package Geneltekrar_ifelse;

import java.util.Scanner;

public class Orneksoru {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println( "Lutfen pozitif bir tamsayi yaziniz.");

        int tamsayi= scan.nextInt();

        if (tamsayi %3==0 && tamsayi %5==0) {
            System.out.println("Tamsayi hem 3 un hem de 5 in katidir.");
        } else if (tamsayi %5==0){
            System.out.println("Tamsayi 5 in katidir.");
        } else if (tamsayi %3==00) {
            System.out.println("Tamsayi 3 un katidir.");
         } else {
            System.out.println("Tamsayi ne 3 un ne de 5 in katidir.");
        }
    }
}
 // java ilk yazdiginin isleminden basladigi icin daha az kapsamli olan ilk yazilir.
// bazen sartlar tamamen karsilamiyorsa durumu sonuncu else, else if seklinde de bitebilir.