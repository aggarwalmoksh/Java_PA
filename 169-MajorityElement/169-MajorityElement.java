// Last updated: 8/13/2026, 11:16:52 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer, Integer>map = new HashMap<>();
4        int n = nums.length;
5
6        for (int num : nums) {
7            map.put(num, map.getOrDefault(num, 0) + 1);
8            if (map.get(num) > n / 2){
9                return num;
10            }
11        }
12        return 0;
13    }
14}