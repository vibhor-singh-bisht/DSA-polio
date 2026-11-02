import java.util.Map;

class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits == null || fruits.length == 0) return 0;

        int i =0;
        int res = 0;
        //Storing fruits along its counter
        Map<Integer,Integer> map = new HashMap<>();

        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j], map.getOrDefault(fruits, 0)+1);
            //If map size exceeds 2 then we remove fruits from starting using i as we can store 2 different kinds of fruits
            while(map.size()>2){
                map.put(fruits[i] , map.get(fruits[i]) -1);

                if(map.get(fruits[i]) == 0) map.remove(fruits[i]);
                i++;
            }
            res = Math.max(res, j - i +1);
        }
        return res;
    }
    }