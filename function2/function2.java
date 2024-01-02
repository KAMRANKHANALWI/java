import java.util.Scanner;

public class function2 {

    public static int calAverage(int a, int b, int c) {
        int n = 3;
        int average = (a + b + c)/n;
        return average;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(calAverage(a, b, c));
    }
}
