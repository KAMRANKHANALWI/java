// import java.util.Scanner;
// public class PatternSixteen {

// 	public static void main(String[] args) {
// 		int i, j, k = 0; 
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter number");
//                 int n=sc.nextInt();
//         for (i = 1; i <= n; i++)  
//         { 
            
//             for (j = i; j < n; j++)  
//                 System.out.print(" "); 
//             while (k != (2 * i - 1)) { 
//                 if (k == 0 || k == 2 * i - 2) 
//                     System.out.print("*"); 
//                 else
//                     System.out.print(" "); 
//                 k++; 
//                 ; 
//             } 
//             k = 0; 
//             System.out.println();  
//         } 
//         // print last row 
//         for (i = 0; i < 2 * n - 1; i++)  
//             System.out.print("*"); 
        
//     } 
// }

import java.util.Scanner;

public class PatternSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = n;
		int nsp = n-2;
		while(row<=n) {
			if(row==1 || row ==n) {
				int cst = 0;
				while(cst<nst) {
					System.out.print("* ");
					cst = cst+1;
				}
			}
			else {
				System.out.print("* ");
				int csp = 0;
				while(csp<nsp) {
					System.out.print("  ");
					csp = csp +1;
				}
				System.out.print("* ");
			}
			System.out.println();
			row = row+1;
			
		}
	
	}

}