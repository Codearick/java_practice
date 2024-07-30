import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int a = scan.nextInt();

        System.out.println("Enter your second number");
        int b = scan.nextInt();

        int sum = a + b;
        System.out.println("The sum of a and b is " + sum);

        int product = a * b;
        System.out.println("The sum of a and b is " + product);

        scan.close();
    }
    
}
