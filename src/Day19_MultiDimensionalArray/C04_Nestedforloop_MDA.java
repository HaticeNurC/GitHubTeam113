package Day19_MultiDimensionalArray;

public class C04_Nestedforloop_MDA {
    public static void main(String[] args) {

        int[][] arr={ {3,5,7},{1,2,3,4},{1,2},{7}};
        //toplam element sayisi kactir

        int elementsayisi=0;

        for (int i = 0; i <arr.length ; i++) {

            elementsayisi+= arr[i].length;

        }
        System.out.println("toplam element sayisi: " + elementsayisi);
        //tum elementlerin toplamini bulum

        int elementlertoplami= 0;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                elementlertoplami+=arr[i][j];

        }


        }
        System.out.println("elementler toplami: " + elementlertoplami);
        int[][] arr2={{3,5,7},{1,2,3,4},{1,2},{7}};
        //array de kac tane cift sayi vardir
        //ilk kisim hep sabittir

        int sayac=0;
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                if (arr2[i][j]  %2==0){
                    sayac++;
                }
            }

        }
        System.out.println("Cift sayi adedi: "+ sayac);

    }
}
