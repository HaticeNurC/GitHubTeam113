package Day28_AccessMod_Encapsulation;

public class C01_EncapsuleDatalar {

    static private String isim = "Yildiz Pazarlama";

    private int satisTutari;
    public int toplamSatis;

    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis+= satisTutari;
    }
}
