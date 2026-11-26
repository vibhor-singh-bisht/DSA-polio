
class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int minWeight = 0;
        int maxWeight = 0;

        for (int weight : weights) {
            minWeight = Math.max(minWeight, weight);
            maxWeight += weight;
        }

        while (minWeight < maxWeight) {

            int mid = minWeight + (maxWeight - minWeight) / 2;

            if (canShipIt(weights, days, mid)) {
                maxWeight = mid;
            } else {
                minWeight = mid + 1;
            }
        }

        return minWeight;
    }

    private boolean canShipIt(int[] weights, int days, int reqWeight) {

        int totalDays = 1;
        int sumWeight = 0;

        for (int weight : weights) {

            if (sumWeight + weight > reqWeight) {
                totalDays++;
                sumWeight = 0;
            }

            sumWeight += weight;
        }

        return totalDays <= days;
    }
}
