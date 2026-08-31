class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        # for i in range(len(nums) - 1):
        #     for j in range (i+1, len(nums)):
        #         if ( nums[i] + nums[j] == target):
        #              return [i,j]

        hashmap = {}

        for i in range (len(nums)):
            remaining = target - nums[i]

            if remaining in hashmap: 
                return [hashmap[remaining],i]
        
            hashmap[nums[i]] = i

         
        