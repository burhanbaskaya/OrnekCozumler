package replit;

import java.util.Scanner;

public class TR_For_while_4 {
    public static void main(String[] args) {
        //Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //Input : 6
        //Output: 6!=65432*1=720

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int carpim = 1;
        String iBirlesim="";

        for (int i = sayi; i >1; i--) {
            carpim *= i;
            iBirlesim += i+"*";

        }
        System.out.println(sayi+"!= "+iBirlesim+"1 = "+carpim);


    }
}
