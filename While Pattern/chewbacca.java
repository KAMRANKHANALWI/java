// import java.util.Scanner;

// public class chewbacca {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long x = sc.nextLong();
//         sc.close();
        
//         // Convert the number to a string
//         String xStr = Long.toString(x);
        
//         // Convert the string to a char array for easy manipulation
//         char[] xCharArray = xStr.toCharArray();
        
//         // Iterate through the digits
//         for (int i = 0; i < xCharArray.length; i++) {
//             int digit = xCharArray[i] - '0'; // Convert char to int
//             int invertedDigit = 9 - digit; // Calculate the inverted digit
            
//             // If the inverted digit is smaller than the original digit and not the leftmost digit
//             if (invertedDigit < digit && !(i == 0 && invertedDigit == 0)) {
//                 xCharArray[i] = (char) (invertedDigit + '0'); // Replace the digit
//             }
//         }
        
//         // Convert the char array back to a string
//         String result = new String(xCharArray);
        
//         // Convert the string to a long
//         long finalNumber = Long.parseLong(result);
        
//         System.out.println(finalNumber);
//     }
// }

import java.util.Scanner;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();

        long result = transformNumber(x);
        
        System.out.println(result);
    }

    static long transformNumber(long x) {
        if (x == 0) {
            return 9; // Special case: 0 should be transformed to 9 to avoid leading zeros.
        }

        long result = 0;
        long multiplier = 1; // To keep track of the position value of the digits.

        while (x > 0) {
            long digit = x % 10;
            long invertedDigit = 9 - digit;

            // Ensure that the first digit of the result is not 0
            if (x / 10 == 0 && invertedDigit == 0) {
                invertedDigit = 9;
            }

            // Compare the inverted digit with the original digit and choose the smaller one
            result = Math.min(invertedDigit, digit) * multiplier + result;
            
            multiplier *= 10;
            x /= 10;
        }

        return result;
    }
}

