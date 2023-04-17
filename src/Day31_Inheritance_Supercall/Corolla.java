package Day31_Inheritance_Supercall;

public class Corolla extends BToyota{

   protected String str3="Corolla";

    protected Corolla(){

        System.out.println("Parametresi corolla constructoru calisti");

    }
    protected Corolla(int sayi){
        this();

        System.out.println("Int parametreli Corolla constructori calisti");
    }

    public static void main(String[] args) {
        Corolla obj1=new Corolla(5);

    }
}
