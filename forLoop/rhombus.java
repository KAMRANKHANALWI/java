import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=n-i; j>=1; j--) {
                System.out.print("  ");
            }
            // star
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
