package Day11__;

public class startwith_endwith {

    public static void main(String[] args) {

        String str="Java harika";
        System.out.println(str.startsWith("Ja"));

        System.out.println(str.startsWith(str));

        System.out.println(str.endsWith(str.substring(str.length() - 1))) ;

        System.out.println(str.endsWith("ka"));

        System.out.println(str.endsWith("k"));


    }
}
