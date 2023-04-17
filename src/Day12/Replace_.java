package Day12;

public class Replace_ {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.replace("J", "H"));

        System.out.println(str.replace("v", "yayaya"));

        System.out.println(str.replace("Java", "X"));

        System.out.println(str = str.replace(" ", "")); // JavaCandir olur.

        System.out.println(str.replaceFirst("a", "")); //JvaCandir olur

        //Replace All;

        String str1= "J1a23va C01an45%^dir,,,";

        str1= str1.replaceAll("\\d", "");
        System.out.println(str1);


        str1= str1.replaceAll(" ", "5");
        System.out.println(str1);


       str1=str1.replaceAll("\\W", "");
        System.out.println(str1);

        str1= str1.replaceAll("5", " ");

        System.out.println(str1);



    }
}
