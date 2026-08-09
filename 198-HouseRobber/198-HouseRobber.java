// Last updated: 8/9/2026, 8:21:01 PM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4
5        if (n==1) return nums[0];
6        if (n==2) return Math.max(nums[0], nums[1]);
7
8        int[] maxm = new int[n];
9
10        maxm[0] = nums[0];
11        maxm[1] = Math.max(nums[0], nums[1]);
12
13        for (int i = 2; i < nums.length; i++) {
14            maxm[i] = Math.max((nums[i] + maxm[i-2]), maxm[i-1]);
15        }
16
17        return maxm[n-1];
18    }
19}