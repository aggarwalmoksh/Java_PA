// Last updated: 10/15/2026, 5:39:45 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> mp = new HashMap<>();
4        for (int num : nums) {
5            mp.put(num, mp.getOrDefault(num, 0) + 1);
6        }
7
8        PriorityQueue<Integer> pq = new PriorityQueue<>( 
9            (a, b) -> mp.get(a) - mp.get(b)
10        );
11
12        for (int n : mp.keySet()) {
13            pq.add(n);
14            if (pq.size() > k) {
15                pq.poll();
16            }
17        }
18
19        int[] ans = new int[k];
20        for (int i = k-1; i >= 0; i--) {
21            ans[i] = pq.poll();
22        }
23
24        return ans;
25    }
26}