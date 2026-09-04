package Week1.Vibhor.Friday;
import java.util.Arrays;

public class Q1MoveZeroesBruteForce {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for( int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[nonZeroIndex];
            nums[nonZeroIndex] = nums[i];
            nums[i] = temp;
            nonZeroIndex++;
            }
        }
    }
    public static void main(String[] args) {
        Q1MoveZeroesBruteForce solution = new Q1MoveZeroesBruteForce();

        int[] nums = {0, 1, 0, 3, 12};

        solution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
    

