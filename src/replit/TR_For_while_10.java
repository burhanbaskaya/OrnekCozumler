package replit;

public class TR_For_while_10 {
    public static void main(String[] args) {

        // 1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
        //OutPut:
        //Sayilarin Toplami : 5050

        int sayi = 100;
        int toplam = 0;

        for (int i = 1; i <= 100; i++) {

            toplam += i;

        }
        System.out.println("Sayilarin Toplami : "+toplam);

    }
}