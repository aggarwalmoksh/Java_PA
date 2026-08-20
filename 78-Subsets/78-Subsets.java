// Last updated: 8/20/2026, 1:35:52 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        List<Integer> current = new ArrayList<>();
5        backtrack(0, current, nums, res);
6        return res;
7    }
8
9    public void backtrack(int index, List<Integer> current, int[] nums, List<List<Integer>> res) {
10        if (index == nums.length) {
11            res.add(new ArrayList<>(current));
12            return;
13        }
14
15        current.add(nums[index]);
16        backtrack(index+1, current, nums, res);
17        current.remove(current.size()-1);
18        backtrack(index+1, current, nums, res);
19    }
20}