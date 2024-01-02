public class subarrays {
    public static void subarrays(int numbers[]) {
        int ts = 0;
        // int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++) { // print
                    System.out.print(numbers[k]+ " "); // subarray
                    sum += numbers[k];
                    // System.out.println("sum of subarray: " + sum);
                }
                System.out.println();
                System.out.println("sum of subarray: " + sum);
                ts++;
                
            }
            System.out.println();
        }
        System.out.println("total subarray : "+ts);
        // System.out.println("sum of subarray: " + sum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarrays(numbers);
    }
}
