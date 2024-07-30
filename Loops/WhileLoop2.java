// Print sum of first n natural numbers;

import java.util.Scanner;

public class WhileLoop2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the nth natural number :");
        int n = scan.nextInt();
        int sum = 0;
        int i = 0;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of " + n + "th" + " number is : " +sum);
        scan.close();

    }
}
