class SieveOfEratosthenes {

    public static void main(String[] args) {
        int num = 40;

        // Boolean array where:
        // false = number is prime (initially assume all are prime)
        // true = number is not prime
        boolean[] isPrime = new boolean[num + 1];

        sieve(num, isPrime);
    }

    // Function to perform sieve
    static void sieve(int n, boolean[] primes) {
        // Start from 2 (smallest prime), and go till √n
        for (int i = 2; i * i <= n; i++) {

            // If current number is still prime (not marked)
            if (!primes[i]) {

                // Mark all multiples of i as not prime
                // Start from i*2, then i*3, i*4 ... till n
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true; // mark as not prime
                }
            }
        }

        // Print all prime numbers (which are still false in array)
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
