package Day18_Arrays;

public class Arrayenuzun_enkisakelime {
    public static void main(String[] args) {

        String[] arr1={"Melike", "Huseyin","MustafaKemal", "Ece"};
        enUzunenKisaYazdir(arr1);

        String[] arr2={"Su","Latife","Gozdegul"};
        enUzunenKisaYazdir(arr2);

    }
    public static void enUzunenKisaYazdir (String[] arr){
        String enUzunkelime=arr[0];
        String enKisakelime=arr[0];



        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>= enUzunkelime.length() ){
                enUzunkelime=arr[i];

            }
            if (arr[i].length()<=enKisakelime.length()){
                enKisakelime=arr[i];
            }
            
        }

        System.out.println("En uzun kelime :" + enUzunkelime);
        System.out.println("En kisa kelime :" + enKisakelime);

    }
}
