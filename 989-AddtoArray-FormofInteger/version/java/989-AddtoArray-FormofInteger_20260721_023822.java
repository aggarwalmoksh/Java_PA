// Last updated: 7/21/2026, 2:38:22 AM
1class Solution {
2    public List<Integer> addToArrayForm(int[] num, int k) {
3        ArrayList<Integer> result = new ArrayList<>();
4
5        for (int i = num.length - 1; i >= 0; i--) {
6            result.add(0, (num[i] + k) % 10);
7            k = (num[i] + k) / 10;
8        }
9
10        while (k > 0) {
11            result.add(0, k % 10);
12            k /= 10;
13        }
14
15        return result;
16    }
17}