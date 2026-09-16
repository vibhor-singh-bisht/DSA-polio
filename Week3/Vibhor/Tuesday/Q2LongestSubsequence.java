package Week3.Vibhor.Tuesday;

public class Q2LongestSubsequence {
    class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int [] answer = new int[queries.length];
        int x = 0;

        while(x < queries.length){
            int start = 0;
        }
        // for(int i = 0; i < queries.length ;i++){

        // if (x == queries.length) break;
        // int sum = nums[i];
        // int count = 1;
        // if(nums[i]+sum <= queries[x]){
        //     count++;
        //     answer[x] = count;
        // }
        // x++;
        // }
    return answer;
    }
}
    public static void main(String[] args) {
        Solution sol = new Q2LongestSubsequence().new Solution();
        int[] nums = {4, 5, 2, 1};
        int[] queries = {3, 10, 21};
        int[] result = sol.answerQueries(nums, queries);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
    
}
