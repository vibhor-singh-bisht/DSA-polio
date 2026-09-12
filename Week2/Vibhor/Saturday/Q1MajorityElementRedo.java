class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int x = nums[0];

            for( int i = 0 ; i < nums.length ; i++){
                if(nums[i] == x){
                    count++;
                }
                else if( nums[i] != x && count > 0 ) count --;

                else x = nums[i];
            }
            return x;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        Solution sol = new Solution();
        System.out.println(sol.majorityElement(nums));
    }
   
    }
