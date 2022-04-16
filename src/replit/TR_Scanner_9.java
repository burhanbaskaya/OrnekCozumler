package replit;

import java.util.Scanner;

public class TR_Scanner_9 {
    public static void main(String[] args) {
        // Girilen zamanı saniyeye çeviren bir program yazınız.
        //Örnek Çıktı
        //1 saat 10 dakika 50 saniye == 4250 saniye

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen saniyeye cevirmek istediginiz zaman dilimini saat, dakika ve saniye olarak giriniz : ");
        System.out.print("Saat : ");
        int saat = scan.nextInt();
        System.out.print("Dakika : ");
        int dakika = scan.nextInt();
        System.out.print("Saniye : ");
        int saniye = scan.nextInt();

        System.out.println(saat +" saat " + dakika +" dakika "+saniye+ " saniye = "+
                (saat*3600+dakika*60+saniye)+"'dir");

    }
}
