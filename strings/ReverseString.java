import java.util.Scanner;

public class ReverseString {
    public static void printRev(String str, int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Something: ");
        String str = sc.nextLine();
        // String str = "kamran khan alwi";    
        printRev(str, str.length()-1);
    }
}
