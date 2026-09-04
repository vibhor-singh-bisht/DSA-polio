import java.util.Arrays;

public class MoveZeroes {
    // concept of bada bhai 'i' and chota bhai 'j'
    // jaha 'i' make sure krta hai ki har value jo zero se badi hai wo 'j' ko dega
    // jis se 'j' ke paas saare zero se bade number ajaye
    // jab jab zero ayega tab tab i aage badh jaega j ko bin bataye
    // jab koi bada number ayega wo use 'j' ko dedega
    public int[] moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }

        return nums;
    }

    public static void main(String[] args) {
        MoveZeroes obj1 = new MoveZeroes();

        int[] nums = { 1, 0, 3, 4, 0, 12 };
        int[] res = obj1.moveZeroes(nums);
        System.out.println(Arrays.toString(res));
    }
}
