import java.util.Scanner;

public class InvertedHalfPyramidNumber {
    public static void halfPyramidNumber(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n = sc.nextInt();
        System.out.println("Your pyramid is: ");
        halfPyramidNumber(n);
        sc.close();
    }
}
