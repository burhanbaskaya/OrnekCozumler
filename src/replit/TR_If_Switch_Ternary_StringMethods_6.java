package replit;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_6 {

    public static void main(String[] args) {

        // Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        // Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //Eger aynı karakterlere sahipse
        //"isim ayni karakterlere sahiptir." yazdirin.
        //Eger ayni kaakterlere sahip degilse
        //"Dizenin benzersiz karakterleri var" yazdirin.
        //Ternary kullanin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir isim giriniz");
        String isim = scan.next();

        for (int i = 1; i < isim.length(); i++) {

            if (isim.charAt(i) == isim.charAt(i+1)) {
                System.out.println("isim ayni karakterlere sahiptir.");

            }else if (!(isim.charAt(i) == isim.charAt(i+1)))
                System.out.println("Dizenin benzersiz karakterleri var");
            break;


        }



    }
}
