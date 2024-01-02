import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nsp = n - 1;
        int nst = 1;

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
            if(row>n/2) {
                nst-=2;
                nsp++;
            } else {
                nst+=2;
                nsp--;
            }
            row++;
            
        }
    }
}

// Dought hai -- thoda i think it works well for odd
