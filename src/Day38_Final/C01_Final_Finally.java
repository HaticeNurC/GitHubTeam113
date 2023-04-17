package Day38_Final;

public class C01_Final_Finally {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);

      //  Integer.MAX_VALUE=3; bu sekilde deger atamasi yapamayiz constant data

        try {
            System.out.println(10/5); //10/0 yazarsam catch calisir
            System.out.println("bolmenin sonrasindaki satir");
        } catch (Exception e) {
            System.out.println("catch blogundaki satir");

        } finally {
            System.out.println("finally blogundaki satir");
        }
    }
}
