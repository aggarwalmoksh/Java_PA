// Last updated: 9/10/2026, 3:18:37 PM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(nums);
5        backtrack(list, new ArrayList<>(), nums, 0);
6        return list;
7    }
8
9    public void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, int start) {
10        list.add(new ArrayList<>(templist));
11
12        for (int i = start; i < nums.length; i++) {
13            if (i > start && nums[i] == nums[i-1]) continue;
14            templist.add(nums[i]);
15            backtrack(list, templist, nums, i+1);
16            templist.remove(templist.size() - 1);
17        }
18    }
19}