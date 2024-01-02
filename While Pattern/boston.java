// Steps
// 1. Find the prime factors of the given integer, excluding 1.
// 2. Calculate the sum of the digit of the original integer.
// 3. Calculate the sum  of digits of the prime factors obtained in step 1.
// 4. Compare the sums obtained in steps 2 & 3. If they are equal, the integer is a Boston Number otherwise, it is not.

import java.util.Scanner;

public class boston {

    // Fxn to calculate the sum of digit of a number.
    public static int sumDigit(int n) {
        int sum = 0;
        while(n>0) {
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }

    // Fxn to calculate Prime Factor excluding 1.
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fxn to find Sum of Prime Factor of Number n
    public static int primeFactorSum(int n) {
        int sum = 0;

        for(int i=2; i<=n; i++) {
            while(n%i == 0 && isPrime(i)) {
                sum = sum + i;
                n = n/i;
            }
        }
        return sum;
    }

    // Fxn to check if a number is a Boston Number
    public static boolean bostonNumber(int n) {
        int numSum = sumDigit(n);
        int factorsSum = primeFactorSum(n);
        return numSum == factorsSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (bostonNumber(n)) {
            System.out.println(n + " is a Boston Number");
        } else {
            System.out.println(n + " is not a Boston Number");
        }
    }
}
