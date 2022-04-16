package elifHoca_PracticeFree_02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir string giriniz : ");
        String str = scan.next();
        System.out.print("Yazdirmak istediginiz kadar sayi giriniz : ");
        int sayi = scan.nextInt();

        ilkSonHarfBirlestir(str,sayi);
        System.out.println(ilkSonHarfBirlestir(str,sayi));


    }

    private static String ilkSonHarfBirlestir(String str, int sayi) {
        String s = str.substring(0,1)+str.substring(str.length()-1);

        String output = "";

        for (int i = 1; i <= sayi; i++) {

            output+=s;
        }

        return output;
    }
}
