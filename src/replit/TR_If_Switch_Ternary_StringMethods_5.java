package replit;

import java.util.Scanner;

public class TR_If_Switch_Ternary_StringMethods_5 {
    public static void main(String[] args) {

        //Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
        //INPUT:
        //Ay Numarasi:
        //2
        //Yil :
        //2016
        //OUTPUT :
        //Subat 2016 29 Gundur.

        Scanner scan = new Scanner(System.in);
        System.out.println("Yilin kacinci ayini ogrenmek istediginizi giriniz : ");
        int ay = scan.nextInt();

        switch (ay) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Girdiginiz ay 31 gundur");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiginiz ay 30 gundur");
                break;
            case 2:
                System.out.println("Lutfen ogrenmek isteginiz yili giriniz : ");
                int yil = scan.nextInt();
                if (yil%4==0){
                    System.out.println("Girdiginiz yilda Subat ayi 29 gundur...");
                }else
                    System.out.println("Girdiginiz yilda Subat ayi 28 gundur...");
                break;
                default :
                    System.out.println("Lutfen gecerli bir ay giriniz");
        }

    }
}
