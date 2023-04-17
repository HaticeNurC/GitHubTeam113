package Day31_Inheritance_Supercall;

public class D_Personel {

    String isim="personel isim belirtilmemis";
    String unvan="personel unvan belirtilmemis";
    boolean izindemi;

    public void standartMaas(){
        System.out.println("Personel asgari ucreti : "+ 8500);
    }
    public void ozelsigorta(){
        System.out.println("Personelden katki payi alinarak ozel sigorta yaptirilir");
    }


}
