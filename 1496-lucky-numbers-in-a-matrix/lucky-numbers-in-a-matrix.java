import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMin = new int[m];
        Arrays.fill(rowMin, Integer.MAX_VALUE);

        int[] colMax = new int[n];
        Arrays.fill(colMax, Integer.MIN_VALUE);

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int val = matrix[r][c];
                if (val < rowMin[r]) {
                    rowMin[r] = val;
                }
                if (val > colMax[c]) {
                    colMax[c] = val;
                }
            }
        }

        List<Integer> lucky = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int val = matrix[r][c];
                if (val == rowMin[r] && val == colMax[c]) {
                    lucky.add(val);
                }
            }
        }

        return lucky;
    }
}