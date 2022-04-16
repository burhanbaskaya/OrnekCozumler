package replit;

public class TR_For_while_3 {
    public static void main(String[] args) {
        // Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //Input : String str=“Javaisalsoeasy”
        //Output: a s

        String str ="Javaisalsoeasy";
        String yinelenen = "";

        for (int i = 1; i < str.length(); i++) {
            for (int j =i+1; j < str.length(); j++) {

            if (str.substring(i-1,i).equals(str.substring(j-1,j))){
                if (!yinelenen.contains(str.substring(i-1,i))){
                    yinelenen += str.substring(i-1,i)+" ";

                }
            }

        }
        }
        System.out.print(yinelenen);
    }
}
