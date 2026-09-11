package Week2.Vibhor.Friday;
import java.util.Arrays;
public class Q1LongestConsecutive {

    class Solution {
    public int longestConsecutive(int[] nums) {
        // // int count = 0;
        // // HashSet<Integer> = new HashSet<>();
        // // int minIndex = 0;
        // // int min = nums[minIndex];
        // int count = 1;


        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0 ; i < nums.length; i++){
        //     int x = nums[i];
        //     count = 1;

        //     for(int j = 0; j < nums.length ; j++){
        //         if(nums[j] == x + 1){
        //             x++;
        //             count++;
        //         }
        // }
        // }
        // return count;
        if(nums.length == 0 ) return 0;
        Arrays.sort(nums);

        int cons =1;
        int longest = 1;

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1] +1 ) {
                cons++;
                }
            else if ( nums[i] != nums[i-1] ) cons = 1;
            
            longest = Math.max(longest,cons);
        }

        return longest;

        
    }
}
}
