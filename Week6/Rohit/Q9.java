class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;

        int maxSpeed = 0;
        for (int pile : piles) {
            maxSpeed = Math.max(pile, maxSpeed);
        }

        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            if (canEatInTime(piles, h, mid)) {
                // Not doing mid -1 as in normal BS bcz the mid value can be a possible ans
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    private boolean canEatInTime(int[] piles, int h, int speed) {
        int hours = 0;

        for (int pile : piles) {
            hours += (int) Math.ceil((double) pile / speed);
        }
        // If hours are less than or equal to provided "h" than true else false
        return hours <= h;
    }
}
