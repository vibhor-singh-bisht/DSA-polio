class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s) != len(t)):
             return False
        dic1 = {}
        for c in s:
            if c in dic1:
                dic1.update({c:dic1.get(c)+1})
            else:
                dic1.setdefault(c,1)
        for c in t:
            if c not in dic1 or dic1[c] ==0:
                return False;
            dic1[c] = dic1[c] -1;

        return True
        

    
solution = Solution()
s = "aacc"
t = "ccac"
result = solution.isAnagram(s, t)
print(result)