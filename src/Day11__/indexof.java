package Day11__;

public class indexof {
    public static void main(String[] args) {

        String str="Java cok ama cok guzel";
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("cok"));
        System.out.println(str.indexOf("cok",5));

        System.out.println(str.indexOf("cok", 6));

        //soru; cumlenin icinde aranan kelime
        //1 kere kullanilmis,1'den fazla kullanilmis, hic kullanilmamis.

        String cumle="Yasasin java, iyi ki java oogreniyorum";
        String kelime="java";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex= cumle.lastIndexOf(kelime);

        if (ilkIndex==(-1)) {
            System.out.println("aradiginiz kelime hic kullanilmamis");
        } else if (ilkIndex==lastIndex) {
            System.out.println("arasdiginiz kelime cumlede bir kere kullanilmis");

        }else {
            System.out.println("aradiginiz kelime cumlede birden fazla kullanilmis");
        }


    }
}
