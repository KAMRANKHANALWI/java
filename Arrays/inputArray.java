import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // che
        marks[2] = sc.nextInt(); // maths

        System.out.println("phy: " + marks[0]);
        System.out.println("che: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        // Update
        marks[2] = marks[2] + 1;
        System.out.println("maths: " + marks[2]);

        // percentage
        int percentage = (marks[0] + marks[1] + marks[2])/ 3;
        System.out.println("percentage = " + percentage + "%");
    }
}
