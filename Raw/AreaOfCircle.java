import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double radius = scan.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.println("The area of circle is : " + area);

        scan.close();
    }
    
}
