package Day12;

public class ForLoops {
    public static void main(String[] args) {
        for (int i =1 ; i <=10 ; i++) {
            System.out.println( i + " -Java candir");

        }

        //50 den baslayip 100 e kadar sayilari yan yana aralarinda
        //bosluk olacak sekilde yazin

        for (int i = 50; i <=100 ; i++) {
            System.out.print( i +" ");

        }
        System.out.println(" ");

        //3 basamakli sayilardan 23 ile blunebilen sayilari yan yana
        //aralarinda bosluk olacak sekilde yazdirin

         for (int i = 100; i <1000 ; i++) {
            if ( i%23==0 ){
                System.out.print ( i +" ");
            }
        }

        System.out.println(" ");

         //20 den baslayip 7 ser artarak 100 e kadar yazdirin.
        for (int i = 20; i <=100; i+=7) {
            System.out.print ( i + " ");

        }

        System.out.println(" ");

        //100 den baslayarak 1 e kadar 7 ye bolunebilen sayilari yazdirin

        for(int i = 100; i >1 ; i--) { //eger bunu -- yazmazsak snsuza kadar gider

            if (i%7==0 ){
                System.out.print (i + " ");
            }

        }

        }


    }

