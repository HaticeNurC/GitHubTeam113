package Day28_AccessMod_Encapsulation;

public class C02_EncapsulationKullanimi {

    public static void main(String[] args) {

        System.out.println(C01_EncapsuleDatalar.getIsim());

        C01_EncapsuleDatalar obj= new C01_EncapsuleDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println("Toplam satis : " + obj.toplamSatis);
        //toplam satisin sadece gorunup degistirilememsi icin once private yapilir
        //sonra getter() kullanilir.

    }
}
