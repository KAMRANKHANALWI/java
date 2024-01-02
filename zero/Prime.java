import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            if(n == 1) {
                System.out.println("Neither Prime nor Composite]");
            } else {
                System.out.println("This is a Prime Number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
