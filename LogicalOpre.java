public class LogicalOpre {
    public static void main(String[] args) {
        int p = 20 , q = 15 , r = 5;

        // && operator
        System.out.println((p > q) && (p > r));
        System.out.println((p > q) && (p < r));

         // || operator
        System.out.println((r < q) || (p < q));
        System.out.println((p < q) || (r > q));

        // ! operator
        System.out.println(!(p == q));
    }
    
}
