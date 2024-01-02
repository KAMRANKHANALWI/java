import java.util.*;
public class prime {

    // fxn to find prime
    public static boolean isPrime(int n) {
        if( n == 2 ) {
            return true;
        }
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPrime(n) == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}