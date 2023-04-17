package Day31_Inheritance_Supercall;

public class BToyota extends Araba {

   protected String str2="Toyota";

   protected BToyota(){
      this("Java");//super(str:"Java") da yazdim

        System.out.println("Toyota parametresiz constructor calisti");
    }

   protected BToyota(int sayi){

        System.out.println("Toyota int parametreli constructor calisti");
    }
   protected BToyota(String s){
        System.out.println("String parametreli toyota constructor calisti");
    }

}
