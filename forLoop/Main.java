import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1;

        for (int i = 1; i <= N; i++) {
            int next = a + b;
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}
