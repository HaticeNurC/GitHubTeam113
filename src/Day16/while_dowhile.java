package Day16;

public class while_dowhile {
    public static void main(String[] args) {

        int sayi=3;
        int toplam=0;

        while (sayi>0){
            toplam += sayi*sayi;
            sayi--;
            System.out.println("while toplami: "+toplam);

        }
        sayi=-10;
        toplam=0;

        do {
            toplam += sayi * sayi;
            sayi--;
        } while (sayi>0);
        System.out.println("do while toplami: "+ toplam);

        }
    }


