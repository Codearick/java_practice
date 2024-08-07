import java.util.*;

public class FindProduct {
    public static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scan.nextInt();
        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        System.out.println("The product is: " + multiply(a, b));
        scan.close();

    }
    
}
