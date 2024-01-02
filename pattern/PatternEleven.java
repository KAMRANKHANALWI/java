public class PatternEleven {
    public static void main(String[] args) {
        int n = 5;

        for(int line=1; line <= n; line++) {
            for(int j=1; j  <= n - line; j++) {
                System.out.print("  ");
            }
            for(int star = 1; star <= n; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
