import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = n - 1;

        while(row<=n) {
            // space
            int csp = 0;
            while(csp<nsp) {
                System.out.print("\t");
                csp++;
            }
            // star or number
            int cst = 0;
            while(cst<nst) {
                System.out.print(row+"\t");
                cst++;
            }
            System.out.println();
            row++;
            nsp--;
            nst+=2;
        }
    }
}



