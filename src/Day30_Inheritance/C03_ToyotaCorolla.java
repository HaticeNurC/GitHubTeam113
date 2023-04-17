package Day30_Inheritance;

public class C03_ToyotaCorolla extends C02_BToyota{
    String lastik="Lassa";
    String model="Corolla";
    String yakit="Coralla dizel,benzinli,elektrikli";

    public void motor(){

        System.out.println("Corolla");
    }
    public void uretimyeri(){
        System.out.println("Corolla");
    }

    public static void main(String[] args) {

        C03_ToyotaCorolla corolla=new C03_ToyotaCorolla() ;

        System.out.println(corolla.lastik);
        System.out.println(corolla.model);
        System.out.println(corolla.yakit);

        corolla.motor();
        corolla.uretimyeri();

        System.out.println(corolla.marka);
        System.out.println(corolla.aku);
        corolla.guvenlik();

        System.out.println(corolla.vites);

    }
}
