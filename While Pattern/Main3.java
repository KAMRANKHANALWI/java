import java.util.*;
public class Main3 {

    // Fxn to find no. of digit
    public static int no_of_digit(int m) {
        int count = 0;
        while(m>0) {
            m/=10;
            count++;
        }
        return count;
    }

    // Fxn to find sum of digit pow no. of digit
    public static int sum_of_digit(int m, int nod) {
        int sum = 0;
        while(m>0) {
            int rem = m%10;
            sum = sum + (int) Math.pow(rem, nod);
            m /= 10;
        }
        return sum;
    }  

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod = no_of_digit(n);
        int sum_digit = sum_of_digit(n, nod);

        if(sum_digit == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}