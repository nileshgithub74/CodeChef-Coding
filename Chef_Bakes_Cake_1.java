import java.util.Scanner;

 public class Chef_Bakes_Cake_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int cost = 30 *m;
        int sold = 50 * n;

        System.out.println(sold - cost);
       



        sc.close();
    }
}