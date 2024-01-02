import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nsp = n - 1;
        int nst = n;
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
                if(row == 1 || row == n || cst == 0 || cst == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                cst++;
            }
            System.out.println();
            row++;
            nsp--;
        }
    }
}
