import java.util.ArrayList;
import java.util.List;

public class prime {
    public static int countPrimePartitions(int n) {
        List<Integer> primes = generatePrimes(n);
        int count = 0;

        for (int i = 0; i < Math.pow(2, primes.size()); i++) {
            int sum = 0;
            for (int j = 0; j < primes.size(); j++) {
                if ((i & (1 << j)) != 0) {
                    sum += primes.get(j);
                }
            }
            if (sum == n) {
                count++;
            }
        }

        return count;
    }

    private static List<Integer> generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = countPrimePartitions(n);
        System.out.println(result);
    }
}