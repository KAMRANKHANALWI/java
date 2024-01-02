import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 1;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while(row<=n) {
			// spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print("\t");
				csp++;
			}
			// counter number
			int cst = 0;
			while(cst<nst) {
				System.out.print(count+ "\t");
				count++;
				cst++;
			}
			System.out.println();
			row++;
			nst+=2;
			nsp--;
		}
    }
}

