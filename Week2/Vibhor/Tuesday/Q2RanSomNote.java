package Week2.Vibhor.Tuesday;

import java.util.HashMap;

public class Q2RanSomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> map = new HashMap<>();
        for( int i = 0 ; i < magazine.length() ; i++ ){

            if(!map.containsKey(magazine.charAt(i))) map.put(magazine.charAt(i),1);
            else map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
        }

        for(int j = 0 ; j < ransomNote.length() ; j++){
            if(!map.containsKey(ransomNote.charAt(j))) return false;

            else if ( map.containsKey(ransomNote.charAt(j)) && map.get(ransomNote.charAt(j)) <= 0) return false;

            else map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
        }
        return true;
    }
    public static void main(String[] args) {

        Q2RanSomNote obj = new Q2RanSomNote();

        String ransomNote = "aa";
        String magazine = "ab";

        boolean result = obj.canConstruct(ransomNote, magazine);

        System.out.println(result);
    }
} 
