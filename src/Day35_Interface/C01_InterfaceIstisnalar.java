package Day35_Interface;

public interface C01_InterfaceIstisnalar {

    void toplama();

   static void aciklama(){

       System.out.println("Bu methodu implement etmek mecburi degil");
   }
   default void ekIsler(){

       System.out.println("Default keyword ile bodysi olan method olusturulabilir");
   }


}
