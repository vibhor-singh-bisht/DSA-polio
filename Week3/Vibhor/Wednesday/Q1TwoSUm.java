package Week3.Vibhor.Wednesday;

public class Q1TwoSUm {
    class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;

        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum > target) j--;
            if(sum < target) i++;
            if(sum == target) return new int[]{i+1,j+1};
        }
        
        
    
     return new int[]{};   
    }
}
public static void main(String[] args) {
    Solution solution = new Q1TwoSUm().new Solution();
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    int[] result = solution.twoSum(numbers, target);
    for(int num : result) {
        System.out.print(num + " ");
    }
}
    
}
