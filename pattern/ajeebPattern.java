import java.util.Scanner;

public class ajeebPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=n-i; j>=1; j--) {
                System.out.print("  ");
            }
            // star
            for(int j=1; j<=i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("  "+j+" ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
