// Last updated: 8/9/2026, 7:26:07 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int currMax = 0;
4        int currMin = 0;
5        int maxSum = Integer.MIN_VALUE;
6        int minSum = Integer.MAX_VALUE;
7        int totalSum = 0;
8
9        for (int num : nums) {
10            currMax = Math.max(0, currMax) + num;
11            maxSum = Math.max(currMax, maxSum);
12
13            currMin = Math.min(0, currMin) + num;
14            minSum = Math.min(currMin, minSum);
15
16            totalSum += num;
17        }
18
19        if (totalSum == minSum) {
20            return maxSum;
21        }
22
23        return Math.max(maxSum, totalSum - minSum);
24    }
25}