package Day31_Inheritance_Supercall;

public class Araba {

    protected Araba(){
        System.out.println("Araba parametresiz constructor calisti");
    }
    protected Araba(String str){

        System.out.println("Araba str parametreli constructor calisti");
    }
   protected Araba(int a ,int b){

        System.out.println("Araba 2 int parametreli constructor calisti");
    }
}
