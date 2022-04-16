
package elifHoca_PracticeFree_01;

import java.util.Scanner;



public class Q01 {
    public static void main(String[] args) {
        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen carpma islemi icin : * ,\nbolme islemi icin : / , \ntoplama icin : + , \ncikarma icin : - giriniz");
        String islem = scan.next();

        System.out.print("Lutfen yapilacak islem icin iki sayi giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        hesapMakinesi(islem,sayi1,sayi2);



    }

    private static void hesapMakinesi(String islem, int sayi1, int sayi2) {

        switch (islem) {
            case "*" :
                System.out.println(sayi1 +"*"+ sayi2 +" = "+ (sayi1*sayi2));
                break;
            case "/" :
                System.out.println(sayi1 +"/"+ sayi2 +" = "+ (sayi1/sayi2));
                break;
            case "+" :
                System.out.println(sayi1 +"+"+ sayi2 +" = "+ (sayi1+sayi2));
                break;
            case "-" :
                System.out.println(sayi1 +"-"+ sayi2 +" = "+ (sayi1-sayi2));
                break;

                default :
                    System.out.println("Dort islemin haricinde karakter girdiniz");

        }
    }


}
