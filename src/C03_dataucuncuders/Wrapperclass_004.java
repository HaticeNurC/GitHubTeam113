package C03_dataucuncuders;

public class Wrapperclass_004 {
    public static void main(String[] args) {

        String sonucStr="345";
        int sonuc= Integer.parseInt(sonucStr);
        System.out.println(sonuc+10);

        sonuc=Integer.valueOf(sonucStr);
        System.out.println(sonuc+10);

        Integer sayi=10;

        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
    }
}
