package Day18_Arrays;

import java.util.Arrays;

public class C02_arananelemansayisi {
    public static void main(String[] args) {

        int[] arr1={2,4,4,4,6,8,8,9};

        elemansayisiYazdir(arr1, 4);
        elemansayisiYazdir(arr1, 8);

        String[] arr2={"H","F","A","A","S","S","S"};

        elemansayisiYazdir(arr2,"S");


    }

    public static void elemansayisiYazdir(int[] arr, int arananelement){

        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananelement)
                sayac++;
            }
        System.out.println(sayac);

    }public static void elemansayisiYazdir(String[] arr, String arananelement) {

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananelement)
                sayac++;
        }
        System.out.println(sayac);
    }




}
