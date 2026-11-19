class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int h : heights) {
            count[h]++;
        }

        int mismatches = 0;
        int expectedHeight = 1;

        for (int h : heights) {
            while (count[expectedHeight] == 0) {
                expectedHeight++;
            }

            if (h != expectedHeight) {
                mismatches++;
            }
            count[expectedHeight]--;
        }

        return mismatches;
    }
}