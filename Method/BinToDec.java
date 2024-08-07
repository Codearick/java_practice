import java.util.Scanner;

public class BinToDec {
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;

            decNum = decNum + (int)(lastDigit * Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal is: "+decNum);
    }
    public static void main(String args[]){
        System.out.println("Enter your Binary number: ");
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        binToDec(a);
        scan.close();

    }
}
