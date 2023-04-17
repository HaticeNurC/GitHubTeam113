package Day8;

public class sorucozumudevam {
    public static void main(String[] args) {
        int kenar1=10;
        int kenar2=10;
        int kenar3=10;
        System.out.println(kenar1==kenar2 && kenar2==kenar3 && kenar1>0
        ? "Eskenar ucgen" : "Eskenar degil");

//kullanicidan bir harf iste girilen harf kucukse buyuk yazdir degilse harfi yazdir.

        char harf='a';

        System.out.println(harf>='a' && harf<='z'? Character.toUpperCase(harf)
                : harf);
    }
}
