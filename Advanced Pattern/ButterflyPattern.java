public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4; 
        //First Half
        for (int i = 1; i <= n ; i++) {
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces = 2 * (n - i)
            for (int j = 1; j <= 2 * (n -i); j++) {
                System.out.print(" ");
            }
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// Second Half
        for (int i = n; i >= 1; i--) {
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces = 2 * (n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
