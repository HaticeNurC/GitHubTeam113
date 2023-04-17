package Day36_tryCatch_Except;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_CheckedExcepions {

    public static void main(String[] args) throws FileNotFoundException {

        String dosyayolu= "src/Day36_tryCatch_Except/text.txt";

        FileInputStream fis=new FileInputStream(dosyayolu); //method a throw filenotexception ekledi.


    }
}
