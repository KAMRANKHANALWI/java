import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = n/2;
        int nsp = 1;


        while(row<=n) {
            int cst = 0;
            // left star
            while(cst<nst) {
                System.out.print("* ");
                cst++;
            }
            // middle space
            int csp = 0;
            while(csp<nsp) {
                System.out.print("  ");
                csp++;
            }
            // right star
            int cst2 = 0;
            while(cst2<nst) {
                System.out.print("* ");
                cst2++;
            }
            System.out.println();
            if(row<=n/2) {
                nst--;
                nsp+=2;
            } else {
                nst++;
                nsp-=2;
            }
            row++;
            
            
        }
    }
}



