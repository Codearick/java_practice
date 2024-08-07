import java.util.*;

public class FindFactorial {
    public static int fact(int a){
        int ans = 1;
        for(int i = a; i >= 1; i--){
            ans *= i;
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        
        System.out.println("The factorial is: "+ fact(num));
        scan.close();
    }
    
}
