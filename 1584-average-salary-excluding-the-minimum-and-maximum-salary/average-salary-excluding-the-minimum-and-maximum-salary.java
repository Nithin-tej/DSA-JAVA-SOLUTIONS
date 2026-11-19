class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        long sum = 0;

        for (int s : salary) {
            sum += s;
            if (s < minSalary) {
                minSalary = s;
            }
            if (s > maxSalary) {
                maxSalary = s;
            }
        }

        long remainingSum = sum - minSalary - maxSalary;
        return (double) remainingSum / (salary.length - 2);
    }
}