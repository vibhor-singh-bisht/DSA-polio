package Week1.Vibhor.Thursday;

public class Q1BuyAndSellStock {
        public int maxProfit(int[] prices) {
        int min  = prices[0];
        int profit = 0;
        for (int i =0;i<prices.length;i++){
            if(prices[i]<min) min = prices[i];
            if(prices[i] - min > profit) profit =  prices[i] - min;
        }

        return profit;
    }

    
    public static void main(String[] args) {
        Q1BuyAndSellStock solution = new Q1BuyAndSellStock();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = solution.maxProfit(prices);

        System.out.println(result);
    }
    
}
