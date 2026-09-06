public class MajorityElement {

    public int majEleBrute(int nums[]) { // O(n^2)

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; i < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
                if (count > nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement obj1 = new MajorityElement();

        int nums[] = { 3, 2, 3 };
        int res = obj1.majEleBrute(nums);
        System.out.println(res);
    }
}
