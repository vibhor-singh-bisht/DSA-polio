package Week1.Vibhor.Wednesday;

import java.util.HashSet;


public class Q2ArrayIntersection {
    


    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = obj.intersection(nums1, nums2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }



    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] ar = new int[set2.size()];
        int i = 0;

        for (int num : set2) {
            ar[i++] = num;
        }

        return ar;
    }
}
