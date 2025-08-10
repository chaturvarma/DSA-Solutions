class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k == 0) return 0;

        int n = prices.length;

        if (k >= n / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }

        int[] buy = new int[k + 1];
        int[] sell = new int[k + 1];

        for (int i = 0; i <= k; i++) {
            buy[i] = Integer.MIN_VALUE;
        }

        for (int price : prices) {
            for (int j = 1; j <= k; j++) {
                buy[j] = Math.max(buy[j], sell[j - 1] - price);
                sell[j] = Math.max(sell[j], buy[j] + price);
            }
        }

        return sell[k];
    }
}