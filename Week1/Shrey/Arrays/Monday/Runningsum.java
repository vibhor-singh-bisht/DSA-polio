import java.util.Arrays;

public class Runningsum {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Runningsum obj1 = new Runningsum();
        int[] numarray = { 1, 4, 6, 7 };
        int[] result = obj1.runningSum(numarray);
        System.out.println(Arrays.toString(result));
    }

}
