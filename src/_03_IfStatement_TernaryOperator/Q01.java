package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Toplama icin 1 \nCikarma icin 2 \nBolme icin 3 \nCarpma icin 4 giriniz");
		int islem = scan.nextInt();

		System.out.println("Lutfen iki tamsayi giriniz");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (islem==1){
			System.out.println("Toplama isleminin sonucu : " +(num1+num2));
		}else if (islem==2){
			System.out.println("Cikarma isleminin sonucu : " +(num1-num2));
		}else if (islem==3){
			System.out.println("Bolme isleminin sonucu : " +(num1/num2));
		}else if (islem==4){
			System.out.println("Carpma isleminin sonucu : " +(num1*num2));
		}else{
			System.out.println("Hatali secim yaptiniz tekrar deneyiniz");
		}


		
	}

}
