// Qs. Print keyboard combination

public class Recursion13 {
    public static String[] keypad = {".","abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combinaton) {
        if(idx == str.length()) {
            System.out.println(combinaton);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            printComb(str, idx+1, combinaton+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "4";
        printComb(str, 0, "");

    }
}
