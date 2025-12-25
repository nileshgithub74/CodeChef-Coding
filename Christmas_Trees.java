import java.util.Scanner;

 public class Christmas_Trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();

        int result = m *b - n * a;

        System.out.println(result);

        
        sc.close();
    }
}