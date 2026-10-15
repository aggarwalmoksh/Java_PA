// Last updated: 10/15/2026, 5:19:52 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue <Integer> pq = new PriorityQueue<>();
4        for (int num : nums) {
5            pq.add(num);
6            if (pq.size() > k) {
7                pq.poll();
8            }
9        }
10        return pq.peek();
11    }
12}