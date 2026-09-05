package Week1.Vibhor.Saturday;

public class Q1Optimezedfr {
    class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = nums[0];

        for( int i = 0; i<nums.length ; i++){
            if(count == 0){
                element = nums[i];
            }
            if(nums[i] == element) count++;
            else count--;
        }
        return element;
    }
}
    public static void main(String[] args) {

        Q1Optimezedfr solution = new Q1Optimezedfr();
        Solution obj = solution.new Solution();

        int[] nums = {3, 2, 3};

        int result = obj.majorityElement(nums);

        System.out.println(result);
    }
    
}
