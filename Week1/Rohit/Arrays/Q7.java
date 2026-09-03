package Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int diff;
        for(int i =0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                diff = prices[j] - prices[i];
            if(diff> maxProfit){
                maxProfit = diff;
            }
            }
        }

        return maxProfit;
    }
}
