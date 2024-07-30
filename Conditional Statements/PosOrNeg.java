// Write the program that takes number from user and finds whether the number is positive or negative.
import java.util.Scanner;

public class PosOrNeg{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");

        float a = scan.nextFloat();

        if(a < 0){
            System.out.println("The number is Negative!");
        } else{
            System.out.println("The number is positive!");
        }

        scan.close();
    }
}