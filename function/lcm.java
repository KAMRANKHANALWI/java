// public class lcm {
//     public static void main(String[] args) {
        
//     }
// }

// public class lcm {
//     public static void main(String[] args) {
  
//       int n1 = 72, n2 = 120, lcm;
  
//       // maximum number between n1 and n2 is stored in lcm
//       lcm = (n1 > n2) ? n1 : n2;
  
      
//       while(true) {
//         if( lcm % n1 == 0 && lcm % n2 == 0 ) {
//           System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
//           break;
//         }
//         ++lcm;
//       }
//     }
//   }

import java.util.*;
public class lcm {
    public static void lcm(int n1, int n2) {
        int lcm;
        lcm = (n1>n2) ? n1 : n2;

        while(true) {
            if(lcm % n1 == 0  && lcm % n2 == 0) {
                System.out.print(lcm);
                break;
            } 
            lcm++;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        lcm(n1, n2);
    }
}