// Last updated: 8/13/2026, 11:48:39 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int left = 0;
4        
5        for (int right = 0; right < nums.length; right++) {
6            if (nums[right] != 0) {
7                int temp = nums[right];
8                nums[right] = nums[left];
9                nums[left++] = temp;
10            }
11        }
12    }
13}