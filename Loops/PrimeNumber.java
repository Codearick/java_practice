import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int n = scan.nextInt();
        scan.close();

       boolean isPrime = true;

       if(n == 2){
        System.out.println("2 is a prime number!");
       }
       else{
           for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0 || n % 2 == 0){
                isPrime = false;
            }
           }
           if(isPrime){
            System.out.println("It is a prime number");
           } 
           else{
            System.out.println("It is not a prime number!");
           }
       }
       
    }
}
