// import java.util.Scanner;

// public class Armstrong {
//     public static int digit(int n) {
//         int count = 0;
//         while(n<0) {
//             n /= 10;
//             count++;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int remainder, result = 0;
//         int nod = digit(n);

//         while(n<0) {
//             remainder = n%10;
//             result = result + (int) Math.pow(remainder, 3);
//             n = n/10;
//         }

//         if(result == n) {
//             System.out.println("It's an Armstrong Number");
//         } else {
//             System.out.println("It's not an Armstrong Number");
//         }
//     }
// }

// // Error

import java.util.*;
public class Armstrong {

    // fxn to calculate no. of digits
    public static int digitNumber(int num) {
        int count = 0;
        while(num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // fxn for sum of digits to the power of no. of digits
    public static int digitSum(int num, int digitNumber) {
        int sum = 0;
        while(num < 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitNumber);
            num /= 10;
        }
        return sum;
    }

    // // Fxn to check Armstrong Number
    // public static boolean Armstrong(int n) {
    //     int nod = digitNumber(n);
    //     int sumOfNumber = digitSum(n, nod);
    //     return n == sumOfNumber;
    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // calling Armstrong Function
        // System.out.println(Armstrong(n));
        int nod = digitNumber(n);

		int sum_dig = digitSum(n,nod);
		if(sum_dig == n) {
			System.out.println("Is an ArmStrong Number");
		}
		else {
			System.out.println("Is not an ArmStrong Number");
		}
        
    }
}