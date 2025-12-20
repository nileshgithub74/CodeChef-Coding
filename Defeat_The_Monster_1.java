
import java.util.Scanner;

public class Defeat_The_Monster_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        while (t-- > 0) {
            // Your code for each test case goes here
            long h = sc.nextInt();
            long x = sc.nextInt();
            long y = sc.nextInt();

            if (x > y || x >= h + y) {
                ans = 1;
            } else {
                ans = 0;
            }

            System.out.println(ans);

        }
        sc.close();
    }
}
