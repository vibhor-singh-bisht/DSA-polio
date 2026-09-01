public class RemoveDupFromSorted {

    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k += 1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDupFromSorted obj1 = new RemoveDupFromSorted();

        int[] nums = { 1, 2, 2, 4, 5, 6, 6, 7, 7, 8, 9, 9 };
        int result = obj1.removeDuplicates(nums);
        System.out.println(result);
    }

}
