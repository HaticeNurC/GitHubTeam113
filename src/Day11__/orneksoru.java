package Day11__;

import java.util.Scanner;

public class orneksoru {
    public static void main(String[] args) {
        //kullanicidan bir email alin
        //mail @ icermiyorsa "gecersiz email"
        //@gmail.com icermiyorsa "mail gmail olmali"
        //email @gmail.com ile bitmiyorsa "mailde hata var" yazdir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email= scan.nextLine();

        if (!email.contains("@")){
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        } else if (!email.endsWith("@gmail.com")); {
            System.out.println("Mailde hata var");

        }

    }
}
