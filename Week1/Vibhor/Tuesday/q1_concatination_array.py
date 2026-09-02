class Solution(object):
    def getConcatenation(self, nums):
        ar = [0] * (2 * len(nums))
        k = len(nums)

        for i in range(len(nums)):
            ar[i] = nums[i]
            ar[k + i] = nums[i]

        return ar


def main():
    nums = [1, 2, 3]

    obj = Solution()

    result = obj.getConcatenation(nums)

    print(result)


if __name__ == "__main__":
    main()