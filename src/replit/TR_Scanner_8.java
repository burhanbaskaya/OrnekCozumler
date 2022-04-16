package replit;

import java.util.Scanner;

public class TR_Scanner_8 {
    public static void main(String[] args) {

        // Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        //Örnek Çıktı:
        //Verilen tamsayının rakamları toplamı 10'dur.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc basmakli bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int birlerBasamagi = sayi%10;
        int onlarBasamagi = (sayi/10)%10;
        int yuzlerBasamagi = sayi/100;

        System.out.println(birlerBasamagi+onlarBasamagi+yuzlerBasamagi);

    }
}
