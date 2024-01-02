import java.util.Scanner;

public class sumAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int evenSum = 0;
        int oddSum = 0;
        int position = 0; 
        
        while (N > 0) {
            int digit = N % 10; // Extract the rightmost digit
            if (position % 2 == 0) {
                evenSum += digit; // Add to evenSum
            } else {
                oddSum += digit; // Add to oddSum
            }
            N /= 10; // Remove the rightmost digit
            position++; // Move to the next position
        }
        
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
