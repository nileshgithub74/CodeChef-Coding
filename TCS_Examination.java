
import java.util.Scanner;

public class TCS_Examination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Your code for each test case goes here
            int dsa = sc.nextInt();
            int toc = sc.nextInt();
            int dm = sc.nextInt();

            int dsascore = sc.nextInt();
            int tocscore = sc.nextInt();
            int dmscore = sc.nextInt();

            int Dtotal = dsa + toc + dm;
            int Stotal = dsascore + tocscore + dmscore;

            if (Dtotal > Stotal) {
                System.out.println("DRAGON");
            } else if (Stotal > Dtotal) {
                System.out.println("SLOTH");
            } else {

                if (dsa > dsascore) {
                    System.out.println("DRAGON");
                } else if (dsa < dsascore) {
                    System.out.println("SLOTH");
                } else  {
                    if (toc > tocscore) {
                        System.out.println("DRAGON");
                    } else if (toc < tocscore) {
                        System.out.println("SLOTH");

                    }else{
                        System.out.println("TIE");
                    }

                }

            }

        }
        sc.close();
    }
}
