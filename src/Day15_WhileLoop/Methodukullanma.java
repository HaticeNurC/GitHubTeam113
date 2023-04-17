package Day15_WhileLoop;

public class Methodukullanma {
    public static void main(String[] args) {


        System.out.println(isAsal(25));
        System.out.println(isAsal(43));
        //ya da su sekilde yazip atamasini yapabiliriz

        boolean sonuc= isAsal(23);
    }

    //verilen sayi asalsa true degilse false yazdir.yani int i boolean a donustur

    public static boolean isAsal(int sayi) {

        int flag = 0;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag++;
                break;
            }
        }
        if (sayi == 2) {
           return true;
        } else if (flag == 0) {
           return true;
        } else {
            return false;

        }

    }


}
