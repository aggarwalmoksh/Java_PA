// Last updated: 8/12/2026, 1:42:31 PM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        int left = 0;
6        int res = 0;
7        
8        for (int right = 0; right < nums.length; right++) {
9            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
10
11            while (map.get(nums[right]) > k) {
12                map.put(nums[left], map.get(nums[left]) - 1);
13                left++;
14            }
15
16            res = Math.max(res, right - left + 1);
17        }
18
19        return res;
20    }
21}