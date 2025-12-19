import java.util.Scanner;

  class Endless_Play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int h = sc.nextInt();

    
         int result =  (x-4)*24 + h;
         System.out.println(result);





      
        sc.close();
    }
}