import java.util.Scanner;

 public class Biryani_classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = x *y;
            System.out.println(result);
            

        }
        sc.close();
    }
}