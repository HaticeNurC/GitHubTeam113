package Day27_StringBuilder;

public class C04_StrBuilderdaStrMethodlari {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");
        StringBuilder sb2= new StringBuilder("Java candir");

        sb1.substring(5);
        System.out.println(sb1);

        System.out.println(sb1.compareTo(sb2));//-32
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString()));//true

        sb1.subSequence(3,6);
        System.out.println(sb1);
    }
}
