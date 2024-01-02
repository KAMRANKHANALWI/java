public class demo2 {
    public static void change(int arr[]) {
        arr[3] = 4;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        change(arr);

        // print array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
