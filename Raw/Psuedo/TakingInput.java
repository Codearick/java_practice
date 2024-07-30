import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = sc.nextLine();
        System.out.println("Hello " + a + " Welcome !");

        System.out.println("Enter any int number :");

        int number = sc.nextInt();
        System.out.println(number + " is your number");
        
        sc.close();
    } 
}
