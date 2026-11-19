class Solution {
    public int minMoves(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < minVal) {
                minVal = num;
            }
        }

        long moves = 0;
        for (int num : nums) {
            moves += (long) num - minVal;
        }

        return (int) moves;
    }
}