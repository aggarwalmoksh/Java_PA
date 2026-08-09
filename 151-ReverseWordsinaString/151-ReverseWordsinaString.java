// Last updated: 8/9/2026, 7:07:18 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] sarr = s.trim().split("\\s+");
4        StringBuilder ans=  new StringBuilder();
5        for (int i = sarr.length - 1; i >= 0; i--) {
6            ans.append(sarr[i]);
7
8            if (i != 0) {
9                ans.append(" ");
10            }
11        }
12
13        return ans.toString();
14    }
15}