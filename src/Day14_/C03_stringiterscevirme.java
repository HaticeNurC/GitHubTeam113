package Day14_;

public class C03_stringiterscevirme {

    public static void main(String[] args) {
        //bir string olustur ve ters cevir

    }

    public static String stringterscevir (String metin){

        String tersmetin=" ";

        for (int i = metin.length()-1; i>=0 ; i--) {

            tersmetin += metin. charAt(i);

        }
        return tersmetin;





    }
}
