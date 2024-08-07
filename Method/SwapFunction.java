public class SwapFunction{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is: "+ a);
        System.out.println("The value of b is: "+b);

    }
    public static void main(String args[]){
        int a = 5;
        int b = 7;
        swap(a, b);
    }
}