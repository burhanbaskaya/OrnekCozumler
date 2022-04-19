package OrnekSorular;

import java.util.Scanner;

public class HesapMakinesiCozumu {
    public static void main(String[] args) {

        /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yapilacak dort islemi + - * / olarak giriniz");
        char islem = scan.next().charAt(0);

        System.out.println("Birinci sayiyi giriniz : ");
        double s1 = scan.nextDouble();
        System.out.println("Ikınci sayiyi giriniz : ");
        double s2 = scan.nextDouble();

        hesapMakinesi(islem,s1,s2);


    }

    private static void hesapMakinesi(char islem,double s1,double s2) {

        if (islem=='+' || islem=='-' || islem=='/' || islem=='*'){

            switch(islem){
                case '+':
                    System.out.println(s1+"+"+s2+"="+(s1+s2));
                    break;
                case '-':
                    System.out.println(s1+"-"+s2+"="+(s1-s2));
                    break;
                case '*':
                    System.out.println(s1+"*"+s2+"="+(s1*s2));
                    break;
                case '/':
                    System.out.println(s1+"/"+s2+"="+(s1/s2));
                    break;

              //default:
              //    System.out.println("Lutfen gecerli bir ifade giriniz");



            }


        }else System.out.println("Lutfen gecerli bir ifade giriniz");




    }
}
