package replit;

import java.util.Scanner;

public class TR_For_while_1 {
    public static void main(String[] args) {

        // Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        // ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        //char ch1= 'a' ;
        //	String name =“John came late"
        //	Expected Output:
        //Number of a = 2

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir isim giriniz : ");
        String str = scan.nextLine();
        System.out.print("lutfen bir karakter giriniz : ");
        String karakter = scan.next();
        int sayi =0;

        for (int i = 0; i < str.length(); i++) {
            if (karakter.equals(str.substring(i,i+1))){
                sayi++;

            }

        }
        System.out.println(sayi);


    }
}
