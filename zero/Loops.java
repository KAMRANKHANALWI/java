import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        // int sum = 0;
        // for(int i=0; i<=n; i++) {
        //     sum = sum + i;
        // }

        // System.out.print(sum);

        for(int i=1; i<11; i++) {
            System.out.println(i*n);
        }

    }
}
