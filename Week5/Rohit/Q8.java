class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        if (p.length() > s.length()) {
            return list;
        }

        for(int i =0;i<p.length();i++){
            map1.put(p.charAt(i),
                     map1.getOrDefault(p.charAt(i),0)+1);

            map2.put(s.charAt(i),
                     map2.getOrDefault(s.charAt(i),0)+1);
        }

        if(map1.equals(map2)){
            list.add(0);
        }

        int left = 0;

        for(int right = p.length();right<s.length();right++){

            char chRight = s.charAt(right);

            map2.put(chRight,
                     map2.getOrDefault(chRight,0)+1);

            char chLeft = s.charAt(left);

            map2.put(chLeft,
                     map2.getOrDefault(chLeft,0) -1);

            if(map2.get(chLeft) == 0){
                 map2.remove(chLeft);
            }
                 left++;

            if(map1.equals(map2)){
                list.add(left);
            }
        }
        return list;
    }
}