public class Square {
    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            int sq = i*i;
            if(sq % 2 != 0) {
                System.out.println(sq);
            }
        }
    }
}
