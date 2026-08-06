// Last updated: 8/7/2026, 3:05:04 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        for (int i = 0; i < nums.length; i++) {
4            if (nums[i] <= 0 || nums[i] > nums.length) {
5                nums[i] = nums.length+1;
6            }
7        }
8
9
10        for (int i = 0; i < nums.length; i++) {
11            int num = Math.abs(nums[i]);
12
13            if (num >= 1 && num <= nums.length) {
14            nums[num - 1] = -Math.abs(nums[num - 1]);
15            }
16        }
17
18        for (int i = 0; i < nums.length; i++) {
19            if (nums[i] > 0) {
20                return i+1;
21            }
22        }
23
24        return nums.length+1;
25    }
26}