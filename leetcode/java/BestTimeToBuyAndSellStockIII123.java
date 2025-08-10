class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int[] buy = new int[3];
        int[] sell = new int[3];

        for (int i = 0; i <= 2; i++) {
            buy[i] = Integer.MIN_VALUE;
        }
        
        for (int price : prices) {
            for (int k = 1; k <= 2; k++) {
                buy[k] = Math.max(buy[k], sell[k - 1] - price);
                sell[k] = Math.max(sell[k], buy[k] + price);
            }
        }

        return sell[2];
    }
}