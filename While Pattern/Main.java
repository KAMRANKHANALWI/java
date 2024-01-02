// // 1. 3no.
// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         // Your Code Here
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int row = 1;
//         int nsp = n/2;
//         int nst = 1;

//         while(row<=n) {
//             // spaces
//             int csp = 0;
//             while(csp<nsp) {
//                 System.out.print("\t");
//                 csp++;
//             }
//             // stars
//             int cst = 0;
//             while(cst<nst) {
//                 System.out.print("*"+"\t");
//                 cst++;
//             }
//             System.out.println();
//             if(row<=n/2) {
//                 nsp--;
//                 nst+=2;
//             } else {
//                 nsp++;
//                 nst-=2;
//             }
//             row++;
//         }
//     }
// }

// 4.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 1;
        int row = 1;
        int nst = 1;
        
        while(row<=n) {
            int cst = 0;
            while(cst<nst) {
                System.out.print(counter+"\t");
                counter++;
                cst++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}
