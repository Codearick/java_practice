public class PrimeNumber {
    public static boolean isPrime(int n){
        boolean isPrimeNum = true;

        if(n == 2){
            return true;
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                isPrimeNum = false;
                break;
            }
        }
        return isPrimeNum;
    }

    public static void main(String args []){
        System.out.println(isPrime(11));
    }
    
}
