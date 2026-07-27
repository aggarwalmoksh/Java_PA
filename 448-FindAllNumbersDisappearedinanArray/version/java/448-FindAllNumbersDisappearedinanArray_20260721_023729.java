// Last updated: 7/21/2026, 2:37:29 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        ArrayList<Integer> result = new ArrayList<>();
4
5        for (int i = 0; i < nums.length; i++) {
6            int index = Math.abs(nums[i]) - 1;
7
8            if (nums[index] > 0) {
9                nums[index] = -nums[index];
10            }
11        }
12
13        for (int i = 0; i < nums.length; i++) {
14            if (nums[i] > 0){
15                result.add(i + 1);
16            }
17        }
18
19        return result;
20    }
21}