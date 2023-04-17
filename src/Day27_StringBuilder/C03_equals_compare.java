package Day27_StringBuilder;

public class C03_equals_compare  {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");
        StringBuilder sb2= new StringBuilder("Java");
        String str= "Java";

        System.out.println(sb1==sb2);
        System.out.println(sb1==sb1);

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(str));//false
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3= new StringBuilder("Hava");
        StringBuilder sb4= new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3));
        System.out.println(sb2.compareTo(sb4));
        System.out.println(sb3.compareTo(sb4));
        System.out.println(sb4.compareTo(sb3));
    }
}
