package Day36_tryCatch_Except;

public class C01_trycatch {
    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=0;

        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {

            //e.printStackTrace(); exceptionda gordugumuz tum hata aciklamalarini yazdirir

            //System.out.println("Bolen sayi 0 olamaz");
            //System.out.println(e.getMessage()); by zero hatanin kaynagini gosterdi

            System.out.println(e.getCause());
        }
    }
}
