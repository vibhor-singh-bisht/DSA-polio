package Week3.Rohit;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] map = new int[k];

        map[0] = 1;
        int count = 0;
        int sum = 0;

        for(int n:nums){
            sum += n;
            int mod = sum%k;
            // Convert negative remainder to positive remainder
            if(mod<0){
                mod +=k;
            }
            // Add the count of subarrays with the same remainder so far
            count += map[mod];
            // Increment the count of subarrays with this remainder so far
            map[mod]++;
        }
        return count;
    }
}
