// Last updated: 10/30/2026, 12:43:54 AM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[2 * nums.length];
5        for (int i = 0; i < nums.length; i++) {
6            result[i] = nums[i];
7        }
8
9        for (int i = 0; i < nums.length; i++) {
10            result[i+n] = nums[i];
11        }
12        return result;
13    }
14}