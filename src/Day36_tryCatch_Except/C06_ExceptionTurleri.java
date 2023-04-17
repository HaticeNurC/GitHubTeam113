package Day36_tryCatch_Except;

public class C06_ExceptionTurleri {
    public static void main(String[] args) {

        String str=null;

        System.out.println(str);

        //System.out.println(str.concat("Java"));1- NullPointerException

        String str1="34";
        String str2="23a";

        //System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));2-NumberFormatException

        String str3="Java Candir";

        Object obj=str3;

        Integer a= (Integer) obj;// 3-ClassCastException
    }
}
