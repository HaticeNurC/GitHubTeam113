package Day37_ThrowKeyword;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class C01_Throw {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();
       try {
           if (yas < 0) {
               throw new IllegalArgumentException("Yanlis formatta giris yapildi");

           }
       }   catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }

    }

}

