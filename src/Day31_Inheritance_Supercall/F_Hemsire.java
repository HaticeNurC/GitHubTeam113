package Day31_Inheritance_Supercall;

public class F_Hemsire extends E_Muhasebe{

    String unvan = "Hemsire;";

    public void Standartmaas() {
        System.out.println("Hemsireler min 10bin alir");
    }

    public void ozelsigorta() {
        System.out.println("Hemsireler aylik 300tl ozel sigorta ucreti oder");
    }

    public void nobetucreti(int nobetsayisi) {
        System.out.println(nobetsayisi * 200);

    }

    public static void main(String[] args) {
        F_Hemsire method = new F_Hemsire();
    }

    public void method() {
        System.out.println(this.unvan);
        System.out.println(super.unvan);
        System.out.println(this.sgkNo);
        System.out.println(super.sgkNo);
        this.standartMaas();
        this.fazlamesai(3);
        super.fazlamesai(4);
        this.ozelsigorta();
        super.ozelsigorta();


    }
}
