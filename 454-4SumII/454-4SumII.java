// Last updated: 11/19/2026, 4:52:27 PM
1class Solution {
2    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
3        Map<Integer, Integer> mp = new HashMap<>();
4
5        for (int l : nums4) {
6            for (int k : nums3) {
7                mp.put(l + k, mp.getOrDefault(l+k, 0) + 1);
8            }
9        }
10
11        int count = 0;
12
13        for (int i : nums1) {
14            for (int j : nums2) {
15                count += mp.getOrDefault(-(i+j), 0);
16                
17            }
18        }
19        return count;
20    }
21}