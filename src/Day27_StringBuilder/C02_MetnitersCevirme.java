package Day27_StringBuilder;

public class C02_MetnitersCevirme {
    public static void main(String[] args) {

        String str = "Java Candir.";

        StringBuilder sb= new StringBuilder(str);

        sb.reverse();
        System.out.println(sb);
    }
}
