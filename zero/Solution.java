import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("Enter the Marks:");
            int marks = sc.nextInt();
            if(marks >=90 && marks <= 100) {
                System.out.println("This is Good");
            } else if(marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if(marks >= 0 && marks <= 59) {
                System.out.println("This is good as well");
            }
            System.out.println("Want to continue ? [yes(1) or no(0)]");
            input = sc.nextInt();
        } while (input == 1);
    
    // if(input != (1 | 0)) {
    //     System.out.println("Invalid Input");
    // }
    }
}
