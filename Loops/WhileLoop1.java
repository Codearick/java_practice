import java.util.*;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");

        int userNum = scan.nextInt();
        int i = 0;

        while(i <= userNum){
            if(i == userNum){
                System.out.println(i + " is now equals to " + userNum);
                break;
            }
            System.out.println(i + " still  less than " + userNum);
            i++;
        }

        scan.close();
    }
    
}
