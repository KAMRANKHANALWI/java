// import java.util.*;
// public class reverseArray {
//     public static void main(String args[]) {
//         // Your Code Here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for(int k=arr.length-1; k>0; k--) {
//             System.out.print(k+" ");
//         }
//     }
// }

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Read the number of elements in the array
        int[] arr = new int[n]; // Create an array of size n to store the elements
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        reverseArray(arr); // Call the function to reverse the array
        
        // Print the reversed array values in a space-separated manner
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
    
    // Function to reverse an array
    static void reverseArray(int[] arr) {
        int start = 1;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap the elements at the start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the start and end pointers towards each other
            start++;
            end--;
        }
    }
}
