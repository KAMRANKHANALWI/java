public class StringBldr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        // //char at index 0
        // System.out.println(sb.charAt(0));

        // //set char at index 0
        // sb.setCharAt(0, 'i');
        // // System.out.println(sb);

        // //Insert
        // sb.insert(0, 'S');
        // // System.out.println(sb);

        // sb.delete(2, 3);
        // // System.out.println(sb);

        // //Append
        // sb.append(" ");
        // sb.append("K");
        // sb.append("u");
        // sb.append("mari");
        // System.out.println(sb);

        //Inverse a String
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 = > 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            //replace or set(swapping)
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }    
}
