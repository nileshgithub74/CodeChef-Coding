import java.util.Scanner;

 class Notebook_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a * ( 50*2) * b;
        System.out.println(result);
      


        sc.close();
    }
}