import java.util.Scanner;

 public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int x = sc.nextInt();

            System.out.println(100 -x);
        }
        sc.close();
    }
}