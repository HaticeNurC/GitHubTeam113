package Day10__;

import java.util.Locale;

public class Stringmanupaltion__equals {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.toUpperCase());
        System.out.println(str);

        // eger stringin soon halinde yazilmasini istiyorsan atama yapman gerek.
        str= str.toUpperCase();
        System.out.println(str.toLowerCase());
        //farkli bir dilin karakterinde yazmak gerekiyorsa;

        str=str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str);

        //EGUAL KONUSU

        String str1="Java";
        String str2="JAVA";
        String str3="java";
        String str4="jaVa";

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));

        //eger buyuk ya da kucuk harf onemli olmadan karsilastrimak istersen

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str3.equalsIgnoreCase(str4));

        String str5= "Ja";
        String str6= "va";
        String str7= str5.concat(str6);
        System.out.println(str7);

    }
}
