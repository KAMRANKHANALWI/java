import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter KM: ");
        // int km = sc.nextInt();

        int[] km = {1, 2, 3, 4, 5};
        // int score = 0;
        // if(km == 1 ) {
        //     System.out.println();
        // }

       for(int i=0; i<km.length; i++) {
       
        System.out.println("Are you tired? ");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        

        System.out.println(km[i]);
        if(check == "yes") {
            System.out.println("You didn't finish the race");
            break;
        } if (check == "no") {
            continue;
        } else {
            System.out.println("Invalid input");
        } 
        
       }
    }
}
