package elifHoca_PracticeFree_01;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        /*
		Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called reverseString
		  */
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime = scan.nextLine();
        reverseString(kelime);

        System.out.println("girilen string ifadenin tersi :"+reverseString(kelime));

    }

    private static String reverseString(String kelime) {
        String reversed = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {

            reversed += kelime.charAt(i);

        }

        return reversed;
    }
}
