//Print x^n (stack height = n) | (stack height = nlogn)

public class Recursion4 {
    public static int calcPower(int x, int n) {
        if(n == 0) { // base case 1
            return 1;
        }
        if(x == 0) { // base acse 2
            return 0;
        }

        //Print x^n (stack height = n)
        // int xPownm1 = calcPower(x, n-1); //kaam
        // int xPown = x * xPownm1;
        // return xPown;

        //(stack height = nlogn)
        //if n is even
        if(n % 2 == 0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else { // n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
