// Last updated: 8/9/2026, 8:42:47 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4        for (int num : nums) {
5            result ^= num;
6        }
7        return result;
8    }
9}