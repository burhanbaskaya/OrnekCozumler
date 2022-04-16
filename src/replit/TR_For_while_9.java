package replit;

public class TR_For_while_9 {
    public static void main(String[] args) {
        // Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
        //Input :1238
        //Output :Girilen Numaranin Tersi: 8321

        String input = "1238";
        String output = "";

        for (int i = input.length()-1; i >=0 ; i--) {

            output += input.substring(i,i+1);

        }
        System.out.println(output);

    }
}
