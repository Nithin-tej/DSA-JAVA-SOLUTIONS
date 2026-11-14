
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        int maxFreq = 0;
        int count = 0;

        for (int num : nums) {
            freq[num]++;

            if (freq[num] > maxFreq) {
                maxFreq = freq[num];
                count = freq[num];
            } else if (freq[num] == maxFreq) {
                count += freq[num];
            }
        }

        return count;
    }
}
