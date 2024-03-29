//Arrange ABC in a single line -> All possible arrangements (permutations = n!)

public class Backtracking {
    public static void printPermutation(String str, String perm, int idx) {
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, perm + currChar, idx+1);

        }
    }
    //time complexity = 0(n*n!)
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
