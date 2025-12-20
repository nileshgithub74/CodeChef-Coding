import java.util.Scanner;

 public class Saving_Taxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            // Your code for each test case goes here

            int x = sc.nextInt();
            int y  = sc.nextInt();


            System.out.println(x-y);



            
        }
        sc.close();
    }
}