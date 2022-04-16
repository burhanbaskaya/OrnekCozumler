package OrnekSorular;

public class IlkGun_01Mart {
    public static void main(String[] args) {

        int sayi = 496;
        int toplam=0;

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;
            }
        }
                if (toplam==sayi){
                    System.out.println(sayi+" mukemmel sayidir");
                }else {
                    System.out.println(sayi+" mukemmel sayi degildir");
                }

        int sayi1 = 496;
        int toplam1=0;
        int i = 1;

        while (i<sayi1){
            if (sayi1%i==0){
                toplam += i;
                i++;

            }
        }
        if (toplam==sayi){
            System.out.println(sayi+" mukemmel sayidir");
        }else {
            System.out.println(sayi+" mukemmel sayi degildir");
        }




    }
}
