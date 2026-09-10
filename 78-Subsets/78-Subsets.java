// Last updated: 9/10/2026, 3:14:18 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(nums);
5        backtrack(list, new ArrayList<>(), nums, 0);
6        return list;
7    }
8
9    public void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, int start) {
10        list.add(new ArrayList<>(templist));
11        for (int i = start; i < nums.length; i++) {
12            templist.add(nums[i]);
13            backtrack(list, templist, nums, i+1);
14            templist.remove(templist.size() - 1);        
15        }
16    }
17}