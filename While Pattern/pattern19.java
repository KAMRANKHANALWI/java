// import java.util.Scanner;

// public class pattern19 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int row = 1;
//         int nst = (n+1)/2;
//         int nsp = 0;
        
//         while(row<=n) {
//             // left star
//             while()
//         }

//     }
// }


// RETRY KRNA HAI


import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = (n + 1) / 2;
		int nst2 = (n + 1) / 2;
		int nsp = -1;
		int row = 1;
		while (row <= n) {
			int cst = 0;
			if(row==1|| row==n) {
				cst =1;
			}
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2 = 0;
			while (cst2 < nst2) {
				System.out.print("* ");
				cst2++;
			}
			System.out.println();
			if (row >= (n + 1) / 2) {
				nsp -= 2;
				nst2++;
				nst++;
			} else {
				nsp += 2;
				nst2--;
				nst--;

			}
			row++;

		}

	}

}