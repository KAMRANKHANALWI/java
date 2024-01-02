import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digitToCount = sc.nextInt();
        sc.close();

        int count = countDigitOccurrences(number, digitToCount);
        System.out.println(count);
    }

    // Function to count the occurrences of a digit in a number
    static int countDigitOccurrences(int number, int digitToCount) {
        int count = 0;
        while (number > 0) {
            int lastDigit = number % 10; 
            if (lastDigit == digitToCount) {
                count++; 
            }
            number /= 10; 
        }
        return count;
    }
}
