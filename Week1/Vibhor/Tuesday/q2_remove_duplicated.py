class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k = 1

        for i in range(1,len(nums)):
            if(nums[i] != nums[i-1]):
                nums[k]=nums[i]
                k = k+1
        
        return k


def main():
    nums = [1,1,2]

    obj = Solution()

    k = obj.removeDuplicates(nums)

    print(k)
    print(nums[:k])

if __name__ == "__main__":
    main()