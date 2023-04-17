package Day30_Inheritance;

public class C02_BToyota extends C01_Araba {

    String marka= "Toyota";
    String aku= "Inci aku";
    String lastik= "Bridgestone";

    public void motor(){

        System.out.println("Tum arabalar Toyota motoru ile uretilir");
    }
    public void guvenlik(){

        System.out.println("Toyota guvenli bir markadir");
    }

}
