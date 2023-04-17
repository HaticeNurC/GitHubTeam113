package Day12;

public class Stringitersecevirme {
    public static void main(String[] args) {
        //kullanicidan bir string isteyin ve stringi tersten yazdirin

        String input="Java Candir, can.";

        String output="";

        for (int i = input.length()-1; i >=0; i--) {

            output += input.charAt(i);

        }
        System.out.println(output);
    }
}
