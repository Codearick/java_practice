import java.util.Scanner;

public class BinomialCoeficient {
    public static double fact(double a){
        double ans = 1;
        for(int i = (int) a; i >= 1; i--){
            ans *= i;
        }
        return ans;
    }
    public static double biCo(double n, double r){
        double nmr = fact(n-r);
        double ans = fact(n) / (fact(r) * nmr);
        return ans;
    } 

    public static void main( String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        double n = scan.nextDouble();

        System.out.println("Enter the value of r: ");
        double r = scan.nextDouble();

        System.out.println("The binomial coefficient is: " + biCo(n, r));
        scan.close();
    }
}
