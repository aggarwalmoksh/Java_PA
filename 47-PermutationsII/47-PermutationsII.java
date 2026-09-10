// Last updated: 9/10/2026, 5:09:11 PM
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(nums);
5        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
6        return list;
7    }
8
9    public void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, boolean[] used) {
10        if (templist.size() == nums.length) {
11            list.add(new ArrayList<>(templist));
12        }
13
14        else {
15            for (int i = 0; i < nums.length; i++) {
16                if (used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
17
18                used[i] = true;
19                templist.add(nums[i]);
20                backtrack(list, templist, nums, used);            
21                used[i]=false;            
22                templist.remove(templist.size()-1);
23            }
24        }
25    }
26}