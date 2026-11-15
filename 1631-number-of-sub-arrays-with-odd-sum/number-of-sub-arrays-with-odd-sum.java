class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        long oddCount = 0;
        long evenCount = 1; // Base case: prefix sum of 0 is even
        long currentSum = 0;
        long ans = 0;
        
        for (int num : arr) {
            currentSum += num;
            
            if (currentSum % 2 == 1) { // Current prefix sum is odd
                ans = (ans + evenCount) % MOD;
                oddCount++;
            } else { // Current prefix sum is even
                ans = (ans + oddCount) % MOD;
                evenCount++;
            }
        }
        
        return (int) ans;
    }
}