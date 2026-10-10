class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;

        int lo = 0;
        int hi = people.length -1;

        Arrays.sort(people);

        while(lo<=hi){
            // When we are available to put two persons on a boat
            if(people[lo] + people[hi] <= limit){
                lo++;
            }
            // In case of heavier person we need to move pointer anyways
            hi--;

            boats++;
        }
        return boats;
    }
}