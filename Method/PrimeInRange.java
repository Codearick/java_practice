public class PrimeInRange {
    public static boolean isPrime(int n){
        boolean isPrimeNum = true;

        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrimeNum = false;
                break;
            }
        }
        return isPrimeNum;
    }

    public static void primeCheck(int a){
        for(int i = 2; i <= (a - 1); i++){
            if(isPrime(i) == true){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args []){
        System.out.println(" The prime number till 20 is: ");
        primeCheck(20);
    }
}
