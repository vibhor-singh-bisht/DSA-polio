import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BestStockPrice {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestStockPrice obj1 = new BestStockPrice();

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int[] prices1 = { 7, 6, 4, 3, 1 };

        int res = obj1.maxProfit(prices);
        System.out.println("Profit is :" + res);

    }

}
