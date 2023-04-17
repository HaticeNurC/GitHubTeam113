package Day29_Inheritance;

public class C02_ChildClass extends C01_ParentClass {

    int c=20;
    int a;

    String s="Child class";
    String m;

    public void method1(){

        System.out.println("Child method1 calisti");

    }

    public static void main(String[] args) {

        //child classtan bir obje olusturalim ve ozelliklerini yazdiralim

        C02_ChildClass obj= new C02_ChildClass();

        System.out.println(obj.a);
        System.out.println(obj.c);
        System.out.println(obj.s);
        System.out.println(obj.b);
        System.out.println(obj.m);
        System.out.println(obj.t);

        obj.method1();
        obj.method2();



    }
}
