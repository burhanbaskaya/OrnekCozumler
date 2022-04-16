package replit;

import java.util.Scanner;

public class TR_Scanner_10 {
    public static void main(String[] args) {

        // Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        // INPUT:
        // Dakika sayısı: 3456789
        // OUTPUT :
        // 3456789 dakika yaklaşık 6 yıl 210 gündür

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil ve gun sayisina cevirmek istediginiz dakikayi giriniz : ");
        int dakika = scan.nextInt();

        int yil = dakika/(365*24*60);
        int gun = dakika%(365*24*60)/(24*60);

        System.out.println(dakika+" dakika yaklasik "+yil+" yil "+gun+ " gundur");


    }
}
