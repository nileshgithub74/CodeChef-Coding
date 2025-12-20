
import java.util.Scanner;

public class ATM_Machine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            String ans = "";
            for (int i = 0; i < n; i++) {
                if (arr[i] <= k && k >0) {
                    ans += "1";

                    k = k - arr[i];
                } else {
                    ans += "0";
                }

            }

            System.out.println(ans);

        }
        sc.close();
    }
}
