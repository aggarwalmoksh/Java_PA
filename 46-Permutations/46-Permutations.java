// Last updated: 9/10/2026, 3:24:29 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> list = new ArrayList<>();
4        Arrays.sort(nums);
5        backtrack(list, new ArrayList<>(), nums);
6        return list; 
7    }
8
9    public void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums) {
10        if (templist.size() == nums.length) {
11            list.add(new ArrayList<>(templist));
12        }
13        else {
14            for (int i = 0; i < nums.length; i++) {
15                if (templist.contains(nums[i])) continue;
16
17                templist.add(nums[i]);
18                backtrack(list, templist, nums);
19                templist.remove(templist.size() - 1);
20            }
21        }
22    }
23}