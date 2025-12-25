import java.util.Scanner;

 public class Four_Tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int x =  sc.nextInt();

            if(x * 4 <=1000){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


            
        }
        sc.close();
    }
}