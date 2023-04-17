package Day13_;

public class srucozumu_forloops {

    public static void main(String[] args) {
        /*
        verilen satir sayisina gore asagidaki sekli olustur

        *
        **
        ***
        ****
        */

        int satir=6 ;
        for (int i = 1; i <=satir ; i++) { //satir sayisi
            for (int j = 1; j <= i; j++) { //sutun sayisi

                System.out.print("* ");

            }

            System.out.println("");

        }

    }
}
