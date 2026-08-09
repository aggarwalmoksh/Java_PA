// Last updated: 8/9/2026, 8:06:19 PM
1class Solution {
2    public int nsum(int n) {
3        if (n==0) return 0;
4
5        return n + nsum(n-1);
6    }
7    public int missingNumber(int[] nums) {
8        int tn = 0;
9        for (int num : nums) {
10            tn += num;
11        }
12
13        int sum = nsum(nums.length);
14
15        return sum - tn;
16    }
17}