import java.util.*;

class Solution {
    public List<Integer> primeNumbers(int n) {
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

        List<Integer> primesList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primesList.add(i);
            }
        }

        return primesList;
    }

    public List<List<Integer>> findPrimePairs(int n) {
        List<Integer> primes = primeNumbers(n);
        Set<Integer> primeSet = new HashSet<>(primes);
        List<List<Integer>> answer = new ArrayList<>();

        for (int prime : primes) {
            int complement = n - prime;
            if (primeSet.contains(complement) && prime <= complement) {
                answer.add(Arrays.asList(prime, complement));
            }
        }

        return answer;
    }
}