//This is method overloading using parameter
// public class MethodOverloading {
//     public static int sum(int a, int b){
//         return a + b;
//     }

//     public static int sum(int a, int b, int c){
//         return a + b + c;
//     }
//     public static void main(String args []){
//         System.out.println("The sum of a and b is: " + sum(5, 3));
//         System.out.println("The sum of a, b and c is : " + sum(2, 3, 1));
//     }
    
// }

// THis is method overloading using datatype: 

public class MethodOverloading{
    public static int sum(int a, int b){
        return a + b;
    }

    public static String sum(String a){
        return a;
    }
    public static void main(String args []){
        System.out.println("The sum of a and b is: " + sum(5, 3));
        System.out.println("The sum of a, b and c is : " + sum("Thullu"));
    }
}
