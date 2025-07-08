class Solution {
    public int countPrimes(int n) {
        if(n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(i <= 1) {
                isPrime[i] = false;
            }
            else {
                isPrime[i] = true;
            }
        }

        for(int i = 2; i * i < n; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
