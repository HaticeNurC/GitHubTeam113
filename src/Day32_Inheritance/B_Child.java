package Day32_Inheritance;

public class B_Child extends A_Parent{

    String str= "Child";

    void method1(){

        System.out.println("Child method1 calisti");
    }

    public static void main(String[] args) {

        B_Child childC=new B_Child();
        childC.method1();
        System.out.println(childC.str);

        A_Parent childP= new B_Child();
        childP.method1();
        System.out.println(childP.str);
    }
}
