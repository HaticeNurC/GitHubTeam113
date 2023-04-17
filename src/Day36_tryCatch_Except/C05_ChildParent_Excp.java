package Day36_tryCatch_Except;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ChildParent_Excp {
    public static void main(String[] args) {

        String dosyayolu = "src/Day36_tryCatch_Except/text.txt";

        FileInputStream fis = null;

        try {
            fis=new FileInputStream(dosyayolu);

            int k=0;
            while((k= fis.read()) !=(-1)){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {


        }


    }
}

