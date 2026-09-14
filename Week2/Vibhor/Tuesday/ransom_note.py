class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        map = {}
        for c in magazine:
            if( c not in map):
                map[c] =1
            else:
                map[c]=map.get(c)+1
        
        for c in ransomNote:
            if((c not in map) or map.get(c) <=0):
                return False
            else:
                map[c] = map.get(c)-1

        return True;
        

solution = Solution()

ransomNote = "aa"
magazine = "ab"

result = solution.canConstruct(ransomNote, magazine)

print(result)