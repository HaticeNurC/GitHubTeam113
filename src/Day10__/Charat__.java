package Day10__;

public class Charat__ {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.charAt(5));
        //6. harfi yazdirmak icin bir eksigini yazdirdik.ornegin son harf icin su sekilde olur.

        System.out.println(str.charAt(11-1));

        String str1="Java gun gectikce guzellesiyor";

        System.out.println(str1.charAt(str1.length() - 3));
        System.out.println(str1.length()); //bu cumlenin uzunlugunu bize soyler.
    }
}
