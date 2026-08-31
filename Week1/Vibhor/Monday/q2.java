package Week1.Vibhor.Monday;

public class q2 {
     public int[] runningSum(int[] nums) {
        for( int i = 1; i < nums.length ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
    
}
