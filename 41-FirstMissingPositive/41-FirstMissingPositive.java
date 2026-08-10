// Last updated: 8/10/2026, 11:56:22 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int i = 0;
4        while (i < nums.length) {
5            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
6                int temp = nums[i];
7                nums[i] = nums[nums[i] - 1];
8                nums[temp - 1] = temp;
9            }
10            else {
11                i++;
12            }
13        }
14        for (int j = 0; j < nums.length; j++) {
15            if (nums[j] != j+1) {
16                return j+1;
17            }
18        }
19        return nums.length + 1;
20    }
21}