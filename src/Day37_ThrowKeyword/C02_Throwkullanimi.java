package Day37_ThrowKeyword;

public class C02_Throwkullanimi {

    public static void main(String[] args) {

        String a = null;
        String b = "";

        try {


            try {
                int c = a.length() + b.length();
            } catch (NullPointerException e) {

                if (b.length() == 0) {
                    throw new RuntimeException(e);
                }
                System.out.println("Null point vardir, islem yapilamaz");


            }
            }catch (RuntimeException e) {
            System.out.println("Throw keyword calisti");
        }
    }
}