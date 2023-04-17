package Day45_Maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C03_OrnekCozum_ONEMLI {
    public static void main(String[] args) {

        //Asagidaki body yi Map olarak olarak olusturun

        /*
        firstname : Ahmet
        lastname :Bulutluoz
        totalprice : 500
        depositpaid: false
        bookilngdates: {
                   checkin : 2021-06-01
                   checkout: 2021-06-10
                   },
          additional needs: "wi-fi"}

         */

        Map<String, Object> reqbody= new HashMap<>();
        reqbody.put("firstname", "Burcu" );
        reqbody.put("lastname", "Sever");
        reqbody.put("totalprice", 500);
        reqbody.put("depositpaid", false);

        Map<String,String> bookingdatesMap= new HashMap<>();
        bookingdatesMap.put("checkin", "2021-06-01");
        bookingdatesMap.put("checkout","2021-06-10");

        reqbody.put("bookingdates",bookingdatesMap);
        reqbody.put("additionalneeds", "wifi");

        System.out.println(reqbody);

        //kullanicinin bilgilerini yazdiralim

        System.out.println(reqbody.get("firstname"));
        System.out.println(reqbody.get("lastname"));
        System.out.println(reqbody.get("totalpridce"));//null
        System.out.println(reqbody.get("totalprice"));

        //checkin ve checkoutlari mecburen inner mapin icinde
        //ve mecburen once inner mapi sonra onun icinden bilgileri alicaz

        System.out.println(((Map) reqbody.get("bookingdates")).get("checkin"));
        System.out.println(((Map) reqbody.get("bookingdates")).get("checkout"));

        //ismi selcuk yapalim
        reqbody.put("firstname","Selcuk");
        System.out.println(reqbody);

        //checkoutu 2021-06-17 yapalim
        bookingdatesMap.put("checkout","2021-06-17");
        reqbody.put("bookingdates", bookingdatesMap);

        System.out.println(reqbody);

        //VE JAVA BITER
        



    }
}
