public class decimal2Binary {
    public static void decToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        int myNum = decNum;
        while(decNum > 0) {
            int lastDigit = decNum % 10;
            binNum = binNum + lastDigit * (int)Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }
        System.out.println("Binary  form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        decToBin(12);
    }
}


// BUG