import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int nst = 1;

        while(row<=2*n-1) {
            int cst = 0;
            while(cst < nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if(row < n) {
                nst++;
            } else {
                nst--;
            }
            row++;
        }
    }
}
