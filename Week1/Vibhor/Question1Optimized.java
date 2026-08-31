package Week1.Vibhor;

import java.util.Arrays;
import java.util.HashMap;

public class Question1Optimized {

    public int[] twoSum(int[] nums, int target) {



    
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0 ; i < nums.length ; i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining)){
                return new int[]{i,map.get(remaining)};
            }
            map.put(nums[i],i);
        }

        return new int[]{};
    }

        public static void main(String[] args) {

        Question1Optimized solution = new Question1Optimized();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }


}
    

