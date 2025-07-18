
public class Stocks {

    public static int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyprice) {
                buyprice = prices[i];  // update buyprice when a lower price is found
            } else {
                int currentprofit = prices[i] - buyprice;
                profit = Math.max(profit, currentprofit);  // calculate max possible profit
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};  // Example input
        System.out.println("Maximum Profit: " + maxProfit(arr));
    }
}
