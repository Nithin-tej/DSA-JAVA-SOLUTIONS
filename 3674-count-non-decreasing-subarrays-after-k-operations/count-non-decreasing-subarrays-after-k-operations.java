
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new ArrayDeque<>();

        long operations = 0;
        long count = 0;
        int right = n - 1;

        for (int left = n - 1; left >= 0; left--) {

            while (!deque.isEmpty()
                    && nums[deque.peekFirst()] < nums[left]) {

                int index = deque.pollFirst();

                int next = deque.isEmpty()
                        ? right + 1
                        : deque.peekFirst();

                operations += (long) (next - index)
                        * (nums[left] - nums[index]);
            }

            deque.addFirst(left);

            while (operations > k) {
                operations -= Math.max(
                        0L,
                        (long) nums[deque.peekLast()]
                                - nums[right]
                );

                if (deque.peekLast() == right) {
                    deque.pollLast();
                }

                right--;
            }

            count += right - left + 1;
        }

        return count;
    }
}
