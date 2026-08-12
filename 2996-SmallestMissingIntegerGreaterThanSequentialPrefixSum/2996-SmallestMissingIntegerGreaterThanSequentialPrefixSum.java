// Last updated: 8/12/2026, 3:12:42 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4
5        for (int i = 1; i < nums.length && nums[i] == nums[i - 1] + 1; i++) {
6            sum += nums[i];
7        }
8
9        boolean[] isPresent = new boolean[51];
10
11        for (int num : nums) {
12            isPresent[num] = true;
13        }
14
15        for (int candidate = sum; ; candidate++) {
16            if (candidate >= isPresent.length || !isPresent[candidate]) {
17                return candidate;
18            }
19        }
20    }
21}
22