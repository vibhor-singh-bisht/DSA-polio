package Week1.Vibhor.Thursday;

public class Q2MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum) maxSum = sum;
            if(sum<0) sum = 0;
        }
        return maxSum;
     
    }
    
    public static void main(String[] args) {
        Q2MaximumSubarray solution = new Q2MaximumSubarray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = solution.maxSubArray(nums);

        System.out.println(result);
    }

    

}