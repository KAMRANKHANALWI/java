import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            // 1st Star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            // middle space
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            // 2nd Star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--) {
            // 1st Star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            // middle space
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }
            // 2nd Star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
