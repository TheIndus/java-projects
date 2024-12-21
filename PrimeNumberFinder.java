public class PrimeNumberFinder {
    static boolean isPrime(int i, int n) {
        if (i >= n) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                i++;
                return isPrime(i, n);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2, 7));
        int i = 1;
        int count = 0;

            while (count < 5000) {
                if (isPrime(2, i)) {
                    System.out.println(i + " is a prime number");
                    count++;
                } 
                i++;
                
            }
    }
}
