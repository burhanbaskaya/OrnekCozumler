package elifHoca_PracticeFree_01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
         /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Luften m ve km ye cevirmek istediginiz degeri cm ciinsinden giriniz : ");
        double cm = scan.nextDouble();


        cmMetreKmetreCevir(cm);

    }

    private static void cmMetreKmetreCevir(double cm) {
        double m = cm / 100;
        double km = cm / (100*1000);

        System.out.println(cm+ " cm "+ m + " m " +km+ " km'dir");

    }
}
