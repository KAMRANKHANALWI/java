import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate the number of digits in the given number
        int originalNumber = number;
        int numberOfDigits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }
        
        // Calculate the sum of digits raised to the power of the number of digits
        originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }
        
        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
