package Day22_Foreachloop;

public class C03_Kareleritoplama {
    public static void main(String[] args) {

        int[] arr={2,3,5};

        kareleritoplaminiyazdir(arr) ;

    } public static void kareleritoplaminiyazdir(int[] arr){

        int karelertoplami=0;

        for (int each: arr
             ) {
            karelertoplami+=each*each;


        }
        System.out.println("Sayilarin kareleri toplami " + karelertoplami);
    }
}
