import java.util.*;
public class replace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int multiplier = 1;

        while(n>0) {
            int digit = n%10;
            if(digit == 0) {
                digit = 5;
            }
            result = digit*multiplier + result;
            multiplier *= 10;
            n /= 10;
        }
    }
}