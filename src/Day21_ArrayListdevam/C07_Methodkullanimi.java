package Day21_ArrayListdevam;

public class C07_Methodkullanimi {
    public static void main(String[] args) {
        //verilen sayinin pozitif tam bolenler sayisi 10 dan coksa "Guzel",
        //azsa "Kotu" yazdir

        int sayi=25;

        int pozitiftambolenlersayisi= C06_Tambolenlerlistesi.pozitifbolenlerilistele(sayi).size();

        if (pozitiftambolenlersayisi>10){
            System.out.println("Guzel");
        }else{
            System.out.println("Kotu");
        }
    }
}
