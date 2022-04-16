package OrnekSorular;

import java.util.Scanner;

public class SifreOlusturmaSorusu {
    public static void main(String[] args) {

        /*  Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin
        ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.

        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sifre giriniz : ");
        String sifre = scan.next();

        for (int i = 0; i < sifre.length(); i++) {
            if (!('a'<i && i>'z')){
                System.out.println("Sifreniz kucuk harf icermelidir");
                break;
            }

        }



    }
}
