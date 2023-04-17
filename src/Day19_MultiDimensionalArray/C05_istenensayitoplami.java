package Day19_MultiDimensionalArray;

public class C05_istenensayitoplami {
    public static void main(String[] args) {

        int[][] arr={{13,35,27},{31,52,13,74},{1,62},{37}};

        //arraydeki cift 20 ile 40 arasindaki sayilarin toplamini bulun.

        int istenenelementlerintoplami=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>=20 && arr[i][j]<=40){
                    istenenelementlerintoplami+= arr[i][j];

                }

            }

        } System.out.println("istenen element sayisi toplami: " + istenenelementlerintoplami);
    }
}
