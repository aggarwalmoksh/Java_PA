// Last updated: 8/13/2026, 11:31:47 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k = 2;
4
5        for (int i = 2; i < nums.length; i++) {
6            if (nums[k-2] != nums[i]) {
7                nums[k] = nums[i];
8                k++;
9            }
10        }
11        return k;
12    }
13}