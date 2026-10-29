// Last updated: 10/30/2026, 12:55:12 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int left = 0;
4        int right = n;
5        int idx = 0;
6        int[] result = new int[nums.length];
7        while (right < nums.length) {
8            result[idx++] = nums[left];
9            result[idx++] = nums[right];
10            left++;
11            right++;
12        }
13        return result;
14    }
15}