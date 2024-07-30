import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float marks = 99.999f;
        int b = (int) marks;
        System.out.println(b);

        char ch = 'a';
        int number = ch;
        System.out.println("The number is " +number); 
    }
    
}
