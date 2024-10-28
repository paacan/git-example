package leetcode;

public class leetcode121 {

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = new int[]{7,1,3,4,6};
        solution.maxProfit(prices);
    }
    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0) return 0;

            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }
    }
}
