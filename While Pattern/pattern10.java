import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int row = 1;
        int nst = 2*n-1;
        int nsp = 0;
        while(row<=n) {
            // spaces
            int csp = 0;
            while(csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            // stars
            int cst = 0;
            while(cst<nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row++;
            nst-=2;
            nsp++;
        }
    }
}
