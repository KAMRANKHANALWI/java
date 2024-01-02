public class product {
    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int result = product(5, 9);
        System.out.println(result);

        System.out.println(product(9, 9));
    }
}