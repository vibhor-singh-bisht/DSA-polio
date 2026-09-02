class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        set1 = set()
        set2 = set()

        for i in range(len(nums1)):
            if(nums1[i] not in set1):
                set1.add(nums1[i])
            
        for i in range(len(nums2)):
            if(nums2[i] in set1):
                set2.add(nums2[i])
        
        ar = [0]*len(set2)
        j=0
        for item in set2:
            ar[j] = item
            j = j+1

        return ar

def main():
    nums1 = [1, 2, 2, 1]
    nums2 = [2, 2]

    obj = Solution()

    result = obj.intersection(nums1, nums2)

    print(result)

if __name__ == "__main__":
    main()