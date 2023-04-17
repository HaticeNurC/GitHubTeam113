package Day15_WhileLoop;

public class rakamlartoplami_method {

    public static int rakamlartoplaminibul(int verilensayi) {

        int sayi = verilensayi;
        int birlerbasamagi = 0;
        int rakamlartoplami = 0;

        int basamakSayisi = (sayi + "").length();

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerbasamagi=sayi%10;
            rakamlartoplami+= birlerbasamagi;
            sayi/=10;

        }

        return rakamlartoplami;
    }
}





