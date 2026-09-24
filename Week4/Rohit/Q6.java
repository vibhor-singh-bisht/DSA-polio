package Week4.Rohit;

class Solution {
    public int maxArea(int[] height) {
        
        int lp = 0;
        int rp = height.length - 1;
        int maxWater = 0;

        while(lp<rp){
            int width = rp - lp;
            int ht = Math.min(height[lp], height[rp]);

            int currWater = width * ht;

            maxWater = Math.max(maxWater,currWater);
        // Since the maximum water is limited by the shorter line, move the pointer pointing to the shorter line.
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}
