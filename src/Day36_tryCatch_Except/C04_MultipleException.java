package Day36_tryCatch_Except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_MultipleException {
    public static void main(String[] args) {
        String str= "Java her gecen gun guzellesiyor";
        int[] arr={3,4,5,6,7,8,9,2,3,6,8,9};

        //Kullanicidan 0 veya pozitif bir tamsayi isteyin girilen degeri indeks
        //olarak kullanip str ve arr nin o indexlerindeki elemanlari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozitif bir tamsayi yazin");

//1.yontem(daha profesyonel)
        try {
            int index= scan.nextInt(); //InputMissMatchException

            System.out.println(str.charAt(index)); //StringIndexOutOfBoundsException

            System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {

            e.printStackTrace();
        }
//2.Yontem
        try {
            int index= scan.nextInt(); //InputMissMatchException

            System.out.println(str.charAt(index)); //StringIndexOutOfBoundsException

            System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
        } catch (InputMismatchException e) {
            System.out.println("Tamsayi girmelisin");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index string sinirlari disinda ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index array sinirlari disinda ");
        }


    }
}
