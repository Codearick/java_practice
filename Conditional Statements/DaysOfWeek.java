import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter the number of days from 1 to 7 ");
        // double a = scan.nextDouble();

        while (true) {
            System.out.println("Enter the number of days from 1 to 7 ");
            int a = scan.nextInt();
            switch ( a) {
                case 1:
                    System.out.println("It is Sunday!");
                    break;

                case 2:
                    System.out.println("It is Monday!");
                    break;

                case 3:
                    System.out.println("It is Tuesday!");
                    break;

                case 4:
                    System.out.println("It is Wednesday!");
                    break;

                case 5:
                    System.out.println("It is Thursday!");
                    break;

                case 6:
                    System.out.println("It is Friday!");
                    break;

                case 7:
                    System.out.println("It is Saturday!");
                    break;

                default:
                    System.out.println("You should enter the number between 1 and 7 !!");
            }
        }
    }

}
