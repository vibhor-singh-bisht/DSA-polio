package Week1.Vibhor.Tuesday;

import java.util.Arrays;

public class Q1 {
        public int[] getConcatenation(int[] nums) {
        int [] arr = new int[2*nums.length];
        int j=0;
        for(int i = 0; i < 2*nums.length ; i++){
            if( j == nums.length){
                j = 0;
            }
            arr[i] = nums[j];
            j++;
        }
    
    return arr;
        }

         public static void main(String[] args) {

        Q1 solution = new Q1();

        int[] nums = {1, 2, 1};

        int[] result = solution.getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }
}
