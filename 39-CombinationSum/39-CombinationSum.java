// Last updated: 9/10/2026, 4:37:54 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(candidates);
5        backtrack(list, new ArrayList<>(), candidates, target, 0);
6        return list;
7    }
8
9    public void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, int remain, int start) {
10        if (remain < 0) return;
11        else if (remain == 0) list.add(new ArrayList<>(templist));
12        else {
13            for (int i = start; i < nums.length; i++) {
14                templist.add(nums[i]);
15                backtrack(list, templist, nums, remain - nums[i], i);
16                templist.remove(templist.size() - 1);
17            }
18        }
19    }
20}