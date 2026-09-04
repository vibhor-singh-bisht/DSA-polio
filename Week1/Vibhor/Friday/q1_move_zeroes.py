class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        nonZeroIndex = 0
        for i in range(len(nums)):
            if(nums[i] != 0):
                if(i != nonZeroIndex):
                    temp = nums[nonZeroIndex]
                    nums[nonZeroIndex] = nums[i]
                    nums[i] = temp
                nonZeroIndex+=1

                
    def main():
        nums = [0, 1, 0, 3, 12]

        obj = Solution()

        obj.moveZeroes(nums)

        print(nums)