// Last updated: 8/10/2026, 5:21:33 PM
1class Solution {
2    List<List<Integer>> answer = new ArrayList<>();
3
4    public List<List<Integer>> combine(int n, int k) {
5        solve(1,n,k, new ArrayList<>());
6        return answer;
7    }
8
9    public void solve(int start, int n, int k , List<Integer>list) {
10        if (list.size() == k) {
11            answer.add(new ArrayList<>(list));
12            return;
13        }
14
15        for (int i = start; i <= n; i++) {
16            list.add(i);
17            solve(i+1, n , k, list);
18            list.remove(list.size() - 1);
19        }
20    }
21}