package Day11__;

public class substring__contains {
    public static void main(String[] args) {
        String str="Java ne kadar guzel";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0));

        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(str.length())); //hiclik

        System.out.println(str.substring(5, 7));
        System.out.println(str.substring(3, 4));
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(2, 2)); //hiclik

        //str.substring(5,1) yazamayiz run time erroor verir.

        String str1="Java bil isi kap";
        System.out.println(str1.contains("Java"));
        String s="ka";
        System.out.println(str1.contains(s));
        System.out.println(str1.contains("A"));


    }
}
