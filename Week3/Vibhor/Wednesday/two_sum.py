class Solution(object):
    def twoSum(self, nums, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        i = 0
        j = len(nums) -1
        while(i < j):
            sum = nums[i] + nums[j]
            if(sum > target):
                j = j - 1
            elif(sum < target):
                i = i + 1
            else:
                return  [i+1,j+1]

solution = Solution()
nums = [2, 7, 11, 15]
target = 9
result = solution.twoSum(nums, target)
print(result)
