
import java.util.Scanner;

public class Easy_Pronunciation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int length = sc.nextInt();
            String s = sc.next();
            boolean easytoSpeak = true;

            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count = 0;

                } else {
                    count++;

                    if (count == 4) {
                        easytoSpeak  = false;
                        break;

                    }

                }

            }

           if(easytoSpeak){
            System.out.println("YES");
           }else{
            System.out.println("NO");
           }

        }
        sc.close();
    }
}
