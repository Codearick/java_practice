import java.util.Scanner;

public class DecToBin {

    public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;

        while(decNum > 0){
            int remainder = decNum % 2;
            binNum = binNum + (remainder * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }

        System.out.println("The binary number is: "+ binNum);
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        // System.out.println("Enter your decimal number: ");
        // int a = scan.nextInt();
        decToBin(7);
    }
}
