import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nsp = 0;
        int nst = n;
        while(row<=n) {
            // space
            int csp = 0;
            while(csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            // star
            int cst = 0;
            while(cst<nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nsp++;
            nst--;
            row++;
        }
    }
}
