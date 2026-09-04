package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i =0;i<m;i++){
            list.add(nums1[i]);
        }

        for(int j =0;j<n;j++){
            list.add(nums2[j]);
        }
        Collections.sort(list);
        int k = 0;
        for(Integer s: list){
            nums1[k++] = s;
        }
    }
}
