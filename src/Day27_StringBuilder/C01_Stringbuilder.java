package Day27_StringBuilder;

public class C01_Stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//0

        sb1.append("Mustafa ");

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//7

        sb1.append("Yilmazturk");
        System.out.println(sb1);//Mustafa Yilmazturk 18 karakter
        System.out.println(sb1.capacity()); // 34= (16*2)+2
        System.out.println(sb1.length());//18
    }
}
