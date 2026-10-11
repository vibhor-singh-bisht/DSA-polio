class Solution {
    public int trap(int[] height) {

        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        int l =0;
        int r = height.length - 1;

        while(l<r){
            // The amount of water trapped at any index i is:
            // water[i] = Math.min(leftMax[i], rightMax[i]) - height[i]
            // So processing the sides based on the smaller height allows us to correctly calculate trapped water
            if(height[l] <= height[r]){
            // Checking if we have a building in left which has greater height so that water can be trapped
            if(height[l] < leftMax){
                total = total + leftMax - height[l];
            } 
            else{
                leftMax = height[l];
            }
                l++;
            }
            else{
            // Checking if we have a building in right which has greater height so that water can be trapped  
                if(height[r] < rightMax){
                    total = total+ rightMax - height[r];
                }
                else{
                    rightMax = height[r];
                }
                    r--;
            }
        }
        return total;
        
    }
}