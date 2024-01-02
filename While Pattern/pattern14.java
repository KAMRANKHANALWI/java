import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nsp = n - 1;
        int nst = 1;
        while(row<=2*n-1) {
            // spaces
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

            if(row < n) {
                nsp--;
                nst++;
            } else {
                nsp++;
                nst--;
            }
            row++;
        }
    }
}
