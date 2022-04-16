package OrnekSorular;

public class ornek {
    public static void main(String[] args) {
        int sayi1 = 496;
        int toplam1=0;
        int i = 1;

        while (i<sayi1){
            if (sayi1%i==0){
                toplam1 += i;
                i++;
                }
            }
        if (toplam1==sayi1){
            System.out.println(sayi1+" mukemmel sayidir");
        }else {
            System.out.println(sayi1+" mukemmel sayi degildir");

        }

    }
}
