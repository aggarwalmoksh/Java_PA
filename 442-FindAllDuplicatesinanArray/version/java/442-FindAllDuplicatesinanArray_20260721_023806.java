// Last updated: 7/21/2026, 2:38:06 AM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        ArrayList<Integer> ans = new ArrayList<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int index = Math.abs(nums[i]) - 1;
7
8            if (nums[index] < 0) {
9                ans.add(index + 1);
10            }
11            else {
12                nums[index] = -nums[index];
13            }
14        }
15        
16        return ans;
17
18    }
19}