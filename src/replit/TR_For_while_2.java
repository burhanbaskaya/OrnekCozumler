package replit;

import java.util.Scanner;

public class TR_For_while_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        int ebob = 0;
        int ekok = 0;
        int max = sayi1*sayi2;

        for (int i = max; i >0 ; i--) {
            if (i%sayi1==0 && i%sayi2==0){
                ekok = i;
            }
        }
        System.out.println(ekok);

        for (int i = 1; i < sayi2; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob = i;

            }
        }
        System.out.println(ebob);

    }
}
