package replit;

import java.util.Scanner;


public class TR_If_Switch_Ternary_StringMethods_2 {
    public static void main(String[] args) {
        // Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        // Input :
        // John White
        // 1234234534561478
        // Output : Name :
        // J* W**
        // CCN : ** ** **** 1478

        /** replaceAll()
         *
         */

        // String numara = "$1800 Milyon";

        // System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[a-zA-Z]", "")); //$1800
        // System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[0-9]", "")); //$ Milyon

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi, soyadinizi ve kredi kartinizi numaranizi giriniz : ");
        System.out.print("Ad : ");
        String ad = scan.nextLine();
        System.out.print("Ad : ");
        String soyAd = scan.nextLine();
        System.out.print("Kredi Kart No : ");
        String kKNo = scan.next();

        System.out.println(ad.toUpperCase().substring(0,1)+ad.substring(1).replaceAll("[a-zA-Z]","*")+
                            " "+soyAd.toUpperCase().substring(0,1)+soyAd.substring(1).replaceAll("[a-zA-Z]","*"));
        System.out.println(kKNo.substring(0,kKNo.length()-4).replaceAll("[0-9]","*")+kKNo.substring(kKNo.length()-4));


    }
}
