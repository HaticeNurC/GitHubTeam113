package Day31_Inheritance_Supercall;

public class E_Muhasebe extends D_Personel{

    String sgkNo = "Calisan sgk no belirtilmemis";

    boolean raporlumu;

    public void fazlamesai(int fazlamesaisaati) {
        System.out.println("fazla mesai saati: " + 200);

    }

    public void nobetucreti(int nobetsayisi) {

        System.out.println(nobetsayisi * 500);

    }
}
