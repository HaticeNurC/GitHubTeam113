package Day35_Interface;

public class ChildofImplement implements C01_InterfaceIstisnalar{


    @Override
    public void toplama() {
        //bu methoodun bodysi olmadigi icin override ettik ama digerleri static ve default
        //ekledigimiz icin sorun olusturmadi ve bu ikisinin zaten boodysi vardi

    }

    public static void main(String[] args) {
        ChildofImplement obj=new ChildofImplement();
        obj.ekIsler();

        C01_InterfaceIstisnalar.aciklama();
    }
}
