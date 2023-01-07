class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] remainder = new int[rocks.length];
        int maxBags = 0;
        for (int i = 0; i < rocks.length; i++) {
            remainder[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(remainder);

        for (int bag : remainder) {
            if (bag == 0) {
                maxBags++;
            } else if (additionalRocks >= bag) {
                additionalRocks -= bag;
                maxBags++;
            }
        }
    
        return maxBags;
    }
}