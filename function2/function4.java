import java.util.Scanner;

public class function4 {

    public static void greater(int a, int b) {
        if(a>b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + "is greater");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greater(a, b);
        
    }
}
