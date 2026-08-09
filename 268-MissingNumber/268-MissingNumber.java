// Last updated: 8/9/2026, 8:08:17 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int tn = 0;
4        for (int i =1; i <= nums.length; i++) {
5            tn += i;
6        }
7
8        for (int num : nums) {
9            tn -= num;
10        }
11
12        return tn;
13    }
14}