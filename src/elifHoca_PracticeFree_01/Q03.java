package elifHoca_PracticeFree_01;

public class Q03 {
    public static void main(String[] args) {
        /*   Interview Question
        0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
   */

     //  for (int i = 0; i <= 255; i++) {
     //      char karakter = (char) i;
     //      System.out.println(i +"'nin karakteri : "+karakter);

     //  }
        int i = 0;

        while(i<=255){
            char karakter = (char) i;
            System.out.println(i +"'nin karakteri : "+karakter);
            i++;

        }


    }
}
