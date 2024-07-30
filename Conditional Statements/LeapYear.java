// Write the Java program that takes year from the user and print whether that year is leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year : ");
        double year = scan.nextDouble();

        boolean x = (year % 4 ) == 0;
        boolean y = (year % 100 ) != 0;
        boolean z = ((year % 100) == 0) && ((year % 400) == 0); 

        if(x && (y || z)){
            System.out.println(year + " is a leap year!");
        } else{
            System.out.println(year + " is not a leap year!");
        }

        scan.close();
    
    }
    
}