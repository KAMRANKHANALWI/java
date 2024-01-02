public class largest {
    public static int largestNum(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {4, 6, 88, 99, 101, 0, -9};
        System.out.println(largestNum(numbers));
    }
}
