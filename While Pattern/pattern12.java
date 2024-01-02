import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nsp = n - 1;
        int nst = 1;
        while(row<=n) {
            // spaces
            int csp = 0;
            while(csp<nsp) {
                System.out.print("   ");
                csp++;
            }
            // star
            int cst = 0;
            while(cst<nst) {
                if(cst%2 == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ! ");
                }
                cst++;
            }
            System.out.println();
            row++;
            nsp--;
            nst+=2;
        }
    }
}

// Dought have to ask Sir