package Week1.Vibhor.Tuesday;

public class Q2 {
        public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        q1 obj = new q1();

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }


        public int removeDuplicates(int[] nums) {
        int k =1;
        for( int i = 1; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
