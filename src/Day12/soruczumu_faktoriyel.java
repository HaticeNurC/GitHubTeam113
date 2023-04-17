package Day12;

public class soruczumu_faktoriyel {
    public static void main(String[] args) {
        //kullanicidan 20 den kucuk bir sayi alin ve bu sayinin faktoriyel hesabini yazdirin.

        int sayi = 5;
        int faktoriyel = 1;
        for (int i = sayi; i >= 1; i--) {

            faktoriyel *= i;
            System.out.println(sayi + "!=" + faktoriyel);//bunu loopsun icinde yazarsak bu sekilde
            //alt alta yazar carpimlari.
        }
        System.out.println(sayi + "! =" + faktoriyel);

        int sayi1 = 6;
        int faktoriyel1 = 1;

        System.out.print( sayi1 + "! = ");

        for (int i = sayi1; i >= 1; i--) {

            faktoriyel1 *= i;

            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " ");
            }

        }
        System.out.print("= " + faktoriyel1);

    }
}
